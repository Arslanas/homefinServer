package com.arslan.homefin_server.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BILL")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private BigDecimal value;
    private String currency;

    public Bill() {
    }

    public Bill(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }
}
