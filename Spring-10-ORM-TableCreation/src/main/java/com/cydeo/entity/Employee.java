package com.cydeo.entity;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {



    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate primary key auto
    private long id;
}
