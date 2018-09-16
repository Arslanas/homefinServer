package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.Bill;
import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.service.interfaces.BillService;
import com.arslan.homefin_server.service.interfaces.CategoryService;
import com.arslan.homefin_server.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController{

    @Autowired
    CategoryService service;

    @GetMapping()
    public List<Category> getAll() { return service.findAll();
    }

    @GetMapping("{id}")
    public Category getOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @PutMapping()
    public Category update(@RequestBody Category object) {
        return service.save(object);
    }

    @PostMapping()
    public Category create(@RequestBody Category object) {
        return service.save(object);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteByID(id);
    }
}
