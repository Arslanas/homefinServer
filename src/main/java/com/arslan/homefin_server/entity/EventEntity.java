package com.arslan.homefin_server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "EVENT")
@Data
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    @NotBlank
    private String type;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private int category;
    @NotNull
    @NotBlank
    private String date;
    @NotNull
    @NotBlank
    private String description;
    @NotNull
    private long userId;

    public EventEntity() {
    }

    public EventEntity(String type, BigDecimal amount, int category, String date, String description, long userId) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
        this.userId = userId;
    }
}
