package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.repository.CategoryRepository;
import com.arslan.homefin_server.service.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, Long> implements CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        super(Category.class, repository);
        this.repository = repository;
    }

    @Override
    public List<Category> findAllByUserId(long id) {
        return repository.findAllByUserId(id);
    }

    @Override
    public Category findOneByUserId(long userId, long id) {
        return repository.findByUserIdAndId(userId, id);
    }

    @Override
    public void deleteOneByUserId(long userId, long id) {
        repository.deleteByUserIdAndAndId( userId, id);
    }
}
