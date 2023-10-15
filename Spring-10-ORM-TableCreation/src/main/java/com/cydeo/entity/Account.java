package com.cydeo.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@MappedSuperclass // inherit fields to extended classes in database
public class Account {
    @Id
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
