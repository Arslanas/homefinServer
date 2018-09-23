package com.arslan.homefin_server.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ROLES")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private RoleName rolename;

    public Role() {
    }

    public Role(RoleName rolename) {
        this.rolename = rolename;
    }
}
