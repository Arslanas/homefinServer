package com.arslan.homefin_server.service.interfaces;

import com.arslan.homefin_server.entity.User;

public interface UserService extends GenericService<User, Long>{
    User getUserByEmail(String email);
    User getUserByUsername(String username);
}
