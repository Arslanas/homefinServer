package com.arslan.homefin_server.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private long capacity;

    public Category() {
    }

    public Category(String name, long capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
