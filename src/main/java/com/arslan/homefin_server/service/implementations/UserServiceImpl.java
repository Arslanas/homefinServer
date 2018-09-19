package com.arslan.homefin_server.service.implementations;

import com.arslan.homefin_server.entity.User;
import com.arslan.homefin_server.repository.UserRepository;
import com.arslan.homefin_server.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super(User.class, repository);
        this.repository = repository;
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.getUserByEmail(email);
    }
}
