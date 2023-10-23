package com.cydeo.bootstrap;


import com.cydeo.entity.*;
import com.cydeo.enums.PaymentStatus;
import com.cydeo.repository.*;
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
    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Merchant merchant = new Merchant("Amazon", "1234_code", new BigDecimal("45.4"), new BigDecimal("44.44"), 10);

        Customer c1 = new Customer("Philly", "philly@gmail.com", "Tont", "Montana", "user_1");
        Customer c2 = new Customer("Philly_2", "philly@gmail.comPhilly_2", "TontPhilly_2", "MontanaPhilly_2", "user_2");

        Item i1 = new Item("Milk", "1");
        Item i2 = new Item("Vodka", "2");
        Item i3 = new Item("Sugar", "3");

        Cart cart = new Cart();
        Cart cart2 = new Cart();
        cart.setItems(Arrays.asList(i1, i2, i3));
        cart2.setItems(Arrays.asList(i1, i3));


        Payment p1 = new Payment(new BigDecimal("100.25"), LocalDate.now(), PaymentStatus.PASS);
        p1.setPaymentDetail(new PaymentDetail(new BigDecimal("10.2"), new BigDecimal("13"), LocalDate.now()));

        Payment p2 = new Payment(new BigDecimal("45.25"), LocalDate.now(), PaymentStatus.PASS);
        p2.setPaymentDetail(new PaymentDetail(new BigDecimal("10.2"), new BigDecimal("11"), LocalDate.now()));

        Payment p3 = new Payment(new BigDecimal("101.25"), LocalDate.now(), PaymentStatus.PASS);
        p3.setPaymentDetail(new PaymentDetail(new BigDecimal("22.2"), new BigDecimal("56"), LocalDate.now()));

        p1.setMerchant(merchant);
        p2.setMerchant(merchant);
        p3.setMerchant(merchant);

        p1.setCustomer(c1);
        p2.setCustomer(c2);
        p3.setCustomer(c1);

        p1.setCart(cart);
        p2.setCart(cart2);


        List<Payment> payments = new ArrayList<>(
                Arrays.asList(
                        p1, p2, p3
                )
        );


        itemRepository.saveAll(Arrays.asList(i1, i2, i3));
        cartRepository.saveAll(Arrays.asList(cart,cart2));
        customerRepository.saveAll(Arrays.asList(c1, c2));
        merchantRepository.save(merchant);
        paymentRepository.saveAll(payments);

    }
}
