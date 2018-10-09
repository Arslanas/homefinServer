package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.EventEntity;
import com.arslan.homefin_server.service.interfaces.EventService;
import com.arslan.homefin_server.util.HomefinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventEntityController {

    @Autowired
    EventService service;

    @GetMapping()
    public List<EventEntity> getAll() {
        return service.findAllByUserId(HomefinUtil.getUserId());
    }

    @GetMapping("{id}")
    public EventEntity getOne(@PathVariable("id") Long id) {
        return service.findOneByUserId(HomefinUtil.getUserId(), id);
    }

    @PutMapping()
    public EventEntity update(@Valid @RequestBody EventEntity event) {
        return service.save(event);
    }

    @PostMapping()
    public EventEntity create(@Valid @RequestBody EventEntity event) {
        return service.save(event);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteOneByUserId(id, HomefinUtil.getUserId());
    }
}
