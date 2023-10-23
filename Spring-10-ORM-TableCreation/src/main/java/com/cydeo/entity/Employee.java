package com.cydeo.entity;


import com.cydeo.enums.Gender;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate primary key auto
    private long employeeID;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Pattern(regexp = ".*@gmail\\.com")
    private String email;
    @NotNull
    private LocalDate hiringDate;
    @ManyToOne
    @JoinColumn(name="department_id") // foreign key
    private Department department;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private double salary;
    private String regionId;

    public Employee(String firstName, String lastName, String email, LocalDate hiringDate, Department department, Gender gender, double salary, String regionId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hiringDate = hiringDate;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.regionId = regionId;
    }
}
