package com.arslan.homefin_server.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EVENT")
@Data
@ToString
public class EventEntity {
//Add Date field

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String type;
    private BigDecimal amount;
    private int category;
    private String description;

    public EventEntity() {
    }

    public  EventEntity(String type, BigDecimal amount, int category, String description) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }
}
