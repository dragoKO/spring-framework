package com.cydeo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {


    @Id  // primary key
    private String name;
    private long id;
}
