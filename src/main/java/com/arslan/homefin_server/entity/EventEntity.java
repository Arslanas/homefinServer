package com.arslan.homefin_server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EVENT")
@Data
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String type;
    private BigDecimal amount;
    private int category;
    private String date;
    private String description;

    public EventEntity() {
    }

    public EventEntity(String type, BigDecimal amount, int category, String date, String description) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }
}
