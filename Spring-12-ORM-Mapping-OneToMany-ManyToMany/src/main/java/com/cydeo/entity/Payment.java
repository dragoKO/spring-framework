package com.cydeo.entity;

import com.cydeo.enums.PaymentStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
public class Payment extends BaseEntity {
    private BigDecimal amount;
    private LocalDate localDate;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private long cartID;
    private long customerId;
    @ManyToOne
    @JoinColumn
    private Merchant merchant;
    @OneToOne(cascade = CascadeType.PERSIST)
    private PaymentDetail paymentDetail;

    public Payment(BigDecimal amount, LocalDate localDate, PaymentStatus paymentStatus) {
        this.amount = amount;
        this.localDate = localDate;
        this.paymentStatus = paymentStatus;
    }


}
