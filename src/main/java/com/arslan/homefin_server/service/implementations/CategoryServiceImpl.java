package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.repository.CategoryRepository;
import com.arslan.homefin_server.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, Long> implements CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        super(Category.class, repository);
        this.repository = repository;
    }

}
