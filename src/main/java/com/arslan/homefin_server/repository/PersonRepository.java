package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByFirstname(String firstname);
}
