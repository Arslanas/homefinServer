package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.service.interfaces.BillService;
import com.arslan.homefin_server.util.HomefinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("bill")
@CrossOrigin(origins = "http://localhost:4200")
public class BillController {

    @Autowired
    BillService service;

    @GetMapping()
    public Bill getAll() {
        return service.findAllByUserId(HomefinUtil.getUserId()).stream().findFirst().get();
    }

    @GetMapping("{id}")
    public Bill getOne(@PathVariable("id") Long id) {
        return service.findOneByUserId(HomefinUtil.getUserId(), id);
    }

    @PutMapping()
    public Bill update(@Valid @RequestBody Bill request) {
        Bill bill = service.findAllByUserId(HomefinUtil.getUserId()).stream().findFirst().get();
        bill.setValue(request.getValue());
        bill.setCurrency(request.getCurrency());
        return service.save(bill);
    }

    @PostMapping()
    public Bill create(@Valid @RequestBody Bill request) {
        return service.save(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteOneByUserId(HomefinUtil.getUserId(), id);
    }
}
