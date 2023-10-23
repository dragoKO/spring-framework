package com.cydeo.entity;

import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentDetails extends BaseEntity {
    private BigDecimal commissionAmount;
    private LocalDate payoutDate;
    @OneToOne(mappedBy = "department")
    private int id;
}
