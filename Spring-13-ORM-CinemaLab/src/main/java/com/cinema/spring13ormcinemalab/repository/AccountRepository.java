package com.cinema.spring13ormcinemalab.repository;

import com.cinema.spring13ormcinemalab.entity.AccountDetails;
import com.cinema.spring13ormcinemalab.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<AccountDetails> findByCountryOrState(String country, String state);

    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<AccountDetails> findByAgeLessThanEqual(int age);

    //Write a derived query to list all accounts with a specific role
    List<AccountDetails> findByRole(Role role);

    //Write a derived query to list all accounts between a range of ages
    List<AccountDetails> findByAgeBetween(int ageLower, int ageUpper);

    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<AccountDetails> findByAddressStartingWith(String address);

    //Write a derived query to sort the list of accounts with age
    List<AccountDetails> findAllByOrderByAge();


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts

    //Write a JPQL query to list all admin accounts

    //Write a JPQL query to sort all accounts with age

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value

    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city

    //Write a native query to read all accounts with an age lower than a specific value

}
