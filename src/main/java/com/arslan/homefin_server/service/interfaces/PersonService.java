package com.arslan.homefin_server.service.interfaces;

import com.arslan.homefin_server.entity.Person;

public interface PersonService {
    Person findByFirstname(String name);
}
