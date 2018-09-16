package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.Category;
import com.arslan.homefin_server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
