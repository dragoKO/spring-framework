package com.cydeo.entity;
import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity {

    private String department;
    private String division;

    @OneToOne(mappedBy = "department") // will have only foreign key
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
