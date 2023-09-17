package com.google.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Director {
    private String firstName;
    private String lastName;
    private  int age;
    private String department;
}
