package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private String firstName;
    private String lastName;
    private  String email;
    @Id
    private long id;
}
