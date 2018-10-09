package com.arslan.homefin_server.service.interfaces;

import com.arslan.homefin_server.entity.Category;

import java.util.List;

public interface CategoryService extends GenericService<Category, Long>{
    List<Category> findAllByUserId(long id);
    Category findOneByUserId(long userId, long id);
    void deleteOneByUserId(long userId, long id);
}
