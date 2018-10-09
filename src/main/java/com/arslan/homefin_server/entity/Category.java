package com.arslan.homefin_server.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CATEGORY")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    private long capacity;
    @NotNull
    private long userId;

    public Category() {
    }

    public Category(String name, long capacity, long userId) {
        this.name = name;
        this.capacity = capacity;
        this.userId = userId;
    }
}
