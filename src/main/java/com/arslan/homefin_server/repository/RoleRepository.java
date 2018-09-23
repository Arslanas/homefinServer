package com.arslan.homefin_server.repository;

import com.arslan.homefin_server.entity.Role;
import com.arslan.homefin_server.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> getByRolename(RoleName roleName);
}
