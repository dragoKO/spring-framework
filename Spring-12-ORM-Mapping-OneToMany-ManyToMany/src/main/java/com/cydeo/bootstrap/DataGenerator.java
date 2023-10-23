package com.cydeo.bootstrap;


import com.cydeo.entity.Merchant;
import com.cydeo.entity.Payment;
import com.cydeo.entity.PaymentDetail;
import com.cydeo.enums.PaymentStatus;
import com.cydeo.repository.MerchantRepository;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Merchant merchant = new Merchant("Amazon", "1234_code", new BigDecimal("45.4"), new BigDecimal("44.44"), 10);

        Payment p1 = new Payment(new BigDecimal("100.25"), LocalDate.now(), PaymentStatus.PASS);
        p1.setPaymentDetail(new PaymentDetail(new BigDecimal("10.2"), new BigDecimal("13"), LocalDate.now()));

        Payment p2 = new Payment(new BigDecimal("45.25"), LocalDate.now(), PaymentStatus.PASS);
        p2.setPaymentDetail(new PaymentDetail(new BigDecimal("10.2"), new BigDecimal("11"), LocalDate.now()));

        Payment p3 = new Payment(new BigDecimal("101.25"), LocalDate.now(), PaymentStatus.PASS);
        p3.setPaymentDetail(new PaymentDetail(new BigDecimal("22.2"), new BigDecimal("56"), LocalDate.now()));

        p1.setMerchant(merchant);
        p2.setMerchant(merchant);
        p3.setMerchant(merchant);


        List<Payment> payments = new ArrayList<>(
                Arrays.asList(
                        p1, p2, p3
                )
        );

        merchantRepository.save(merchant);
        paymentRepository.saveAll(payments);

    }
}
