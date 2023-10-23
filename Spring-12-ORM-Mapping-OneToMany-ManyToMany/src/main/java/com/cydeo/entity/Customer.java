package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@Data
public class Customer extends BaseEntity {
    private String address;
    private String email;
    private String firstName;
    private String lastName;
    private String userName;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<Payment> payments;

    public Customer(String address, String email, String firstName, String lastName, String userName) {
        this.address = address;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }
}
