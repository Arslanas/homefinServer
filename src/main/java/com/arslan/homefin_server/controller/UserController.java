package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.entity.User;
import com.arslan.homefin_server.service.interfaces.EventService;
import com.arslan.homefin_server.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping()
    public List<User> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public User getOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @PutMapping()
    public User update(@RequestBody User event) {
        return service.save(event);
    }

    @PostMapping()
    public User create(@RequestBody User event) {
        return service.save(event);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteByID(id);
    }
}
