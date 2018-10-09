package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAllByUserId(long userId);
    Category findByUserIdAndId(long userId, long id);
    void deleteByUserIdAndAndId(long userId, long id);
}
