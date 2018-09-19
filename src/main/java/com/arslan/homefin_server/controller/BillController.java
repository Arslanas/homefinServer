package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.service.interfaces.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bill")
@CrossOrigin(origins = "http://localhost:4200")
public class BillController {

    @Autowired
    BillService service;

    @GetMapping()
    public Bill getAll() { return service.findOne(1L);
    }

    @GetMapping("{id}")
    public Bill getOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @PutMapping()
    public Bill update(@RequestBody Bill object) {
        return service.save(object);
    }

    @PostMapping()
    public Bill create(@RequestBody Bill object) {
        return service.save(object);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteByID(id);
    }
}
