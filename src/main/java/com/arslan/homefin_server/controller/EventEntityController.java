package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("event")
public class EventEntityController {

    @Autowired
    EventRepository repository;

    @GetMapping()
    public List<EventEntity> getAll() {
       return repository.findAll();
    }
    @GetMapping("{id}")
    public EventEntity getOne(@PathVariable("id") long id) {
       return repository.findById(id);
    }
}
