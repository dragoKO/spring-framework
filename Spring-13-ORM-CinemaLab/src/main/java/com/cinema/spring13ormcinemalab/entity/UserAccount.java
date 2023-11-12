package com.cinema.spring13ormcinemalab.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Getter
@Setter
@Table(name = "user_account")
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

    @Override
    public String toString() {
        return "UserAccount{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
