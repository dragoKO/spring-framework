package com.cinema.spring13ormcinemalab.entity;

import com.cinema.spring13ormcinemalab.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "account_details_id"))
public class AccountDetails extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;
    private int postalCode;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetails")
    @JoinColumn(name="account_details_id")
    private UserAccount userAccount;

}
