package com.cydeo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "payments")
@Data
public class Payment extends BaseEntity {
    private BigDecimal amount;
    private LocalDate localDate;
    @Column(length = 125)
    private String paymentStatus;
    private long cartID;
    private long customerId;
    private long merchantId;
    private long paymentDetailId;

}
