package com.cydeo.cydeoApp.repository;

import com.cydeo.cydeoApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirstNameAndLastNameAndEmailIsNotNull(String firstName, String lastName);

    List<Employee> findByFirstNameIsNot(String name);

    List<Employee> findByFirstNameStartingWith(String pattern);

    List<Employee> findBySalaryLessThan(Integer integer);

    List<Employee> findByHireDateBetween(LocalDate date1, LocalDate date2);

    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    List<Employee> findDistinctTop3BySalaryLessThanEqualOrderBySalaryDesc(Integer salary);

    List<Employee> findByEmailIsNull();

    @Query("select e from Employee e where e.email='esandcraftr@toplist.cz'")
    Employee getEmployeeDetail();

    @Query("select e.salary from Employee e where e.email='esandcraftr@toplist.cz'")
        // in JPQL we put class name instead table name
    Integer getEmployeeSalary();

    @Query("select e.salary from Employee e where e.email=?1")
        // Dynamic positional query set
    Optional<Integer> getEmployeeSalary(String email);

    @Query("SELECT e FROM Employee e WHERE e.email LIKE CONCAT('%', ?1) AND e.firstName = ?2")
    Optional<List<Employee>> getEmployeeDetails(String domain, String firstName);


}
