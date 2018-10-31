package com.arslan.homefin_server.controller;

import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.service.interfaces.CategoryService;
import com.arslan.homefin_server.util.HomefinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("categories")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping()
    public List<Category> getAll() {
        return service.findAllByUserId(HomefinUtil.getUserId());
    }

    @GetMapping("{id}")
    public Category getOne(@PathVariable("id") Long id) {
        return service.findOneByUserId(HomefinUtil.getUserId(), id);
    }

    @PutMapping()
    public Category update(@Valid @RequestBody Category object) {
        return service.save(object);
    }

    @PostMapping()
    public Category create(HttpServletRequest request) {
        String test;
        try {

                test = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
                System.out.println(test);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Default Charset = "+ Charset.defaultCharset());
        System.out.println("asdasd   фывфывывф");
        service.save(new Category("дом ик", 230, 1));
        System.out.println(service.findAll());
        return null;
//        System.out.println(object);
//        return service.save(object);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteOneByUserId(HomefinUtil.getUserId(), id);
    }
}
