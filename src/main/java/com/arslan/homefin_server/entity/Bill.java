package com.arslan.homefin_server.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "BILL")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @NotNull
    private BigDecimal value;
    @NotNull
    @NotBlank
    private String currency;
    @NotNull
    @Column(name = "user_id")
    private long userId;

    public Bill() {
    }

    public Bill(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Bill(@NotNull BigDecimal value, @NotNull @NotBlank String currency, @NotNull long userId) {
        this.value = value;
        this.currency = currency;
        this.userId = userId;
    }
}
