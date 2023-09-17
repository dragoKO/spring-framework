package com.google.bootstrap;

import com.github.javafaker.Faker;
import com.google.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Employee> createStudents(int randomStudents) {
        List<Employee> employees = new ArrayList<>();

        Faker faker = new Faker();
        while (employees.size() <= randomStudents) employees.add(
                new Employee(
                        faker.name().firstName(),
                        faker.name().lastName(),
                        faker.number().numberBetween(18, 100),
                        faker.address().state()
                ));

        return employees;
    }
}
