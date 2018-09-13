package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.Person;
import com.arslan.homefin_server.repository.PersonRepository;
import com.arslan.homefin_server.service.interfaces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository repository;

    @Autowired
    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person findByFirstname(String name) {
        return repository.findByFirstname(name);
    }
}
