package com.cydeo.cydeoApp.repository;

import com.cydeo.cydeoApp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    // display all departments in furniture department
    List<Department> findByDepartment(String department);

    // display all department in the Health division
    List<Department> findByDivisionIs(String division);

    // display top 3 department vis division name includes 'Hea' without duplicates
    List<Department> findDistinctTop2ByDivisionContains(String str);

    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);

}
