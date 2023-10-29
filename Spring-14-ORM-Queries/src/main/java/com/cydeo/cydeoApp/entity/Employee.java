package com.cydeo.cydeoApp.entity;

import com.cydeo.cydeoApp.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate localDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @OneToOne
    private Department department;

    @OneToOne
    private Region region;

}
