package com.cinema.spring13ormcinemalab.bootstrap;


import com.cinema.spring13ormcinemalab.enums.Role;
import com.cinema.spring13ormcinemalab.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public DataGenerator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("======================== AccountRepository ==========================");
        System.out.println(accountRepository.findByCountryOrState("b", "Kentucky"));
        System.out.println("============================================================================================");
        System.out.println(accountRepository.findByAgeLessThanEqual(35));
        System.out.println("============================================================================================");
        System.out.println(accountRepository.findByRole(Role.USER));
        System.out.println("============================================================================================");
        System.out.println(accountRepository.findByAgeBetween(35, 60));
        System.out.println("============================================================================================");
        System.out.println(accountRepository.findByAddressStartingWith("2587"));
        System.out.println("============================================================================================");
        System.out.println(accountRepository.findAllByOrderByAge());


    }
}
