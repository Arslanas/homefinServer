package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.service.interfaces.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventEntityController {

    @Autowired
    EventService service;

    @GetMapping()
    public List<EventEntity> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public EventEntity getOne(@PathVariable("id") Long id) {
        return service.findOne(id);
    }

    @PutMapping()
    public EventEntity update(@RequestBody EventEntity event) {
        return service.save(event);
    }

    @PostMapping()
    public EventEntity create(@RequestBody EventEntity event) {
        return service.save(event);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteByID(id);
    }
}
