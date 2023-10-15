package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="students") // set table name
public class Student {
    @Column (name = "studentFirstName",length = 100)
    private String firstName;
    @Column (name = "studentLastName")
    private String lastName;
    private  String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate primary key auto, for postgres
    private long id;
    @Transient // field will not be in the table
    private String city;


    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP") // can be optional
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;



}
