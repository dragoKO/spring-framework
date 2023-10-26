package com.cinema.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Table(name = "user_account")
@Data
@NoArgsConstructor
@AttributeOverride(name = "id", column = @Column(name = "user_account_id"))
public class UserAccount extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "accountDetails_id")
    private AccountDetails accountDetails;

    @OneToMany(mappedBy = "userAccount")
    private Set<Ticket> tickets;

    private String email;
    private String password;
    private String username;


}
