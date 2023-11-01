package com.cydeo.cydeoApp.bootstrap;

import com.cydeo.cydeoApp.entity.Course;
import com.cydeo.cydeoApp.entity.Department;
import com.cydeo.cydeoApp.entity.Employee;
import com.cydeo.cydeoApp.entity.Region;
import com.cydeo.cydeoApp.repository.CourseRepository;
import com.cydeo.cydeoApp.repository.DepartmentRepository;
import com.cydeo.cydeoApp.repository.EmployeeRepository;
import com.cydeo.cydeoApp.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@Transactional
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("================Region=================");

        List<Region> canada = regionRepository.findByCountry("Canada");
        System.out.println(canada);

        List<Region> canadaDistinct = regionRepository.findDistinctByCountry("Canada");
        System.out.println(canadaDistinct);

        List<Region> united = regionRepository.findRegionByCountryContainingIgnoreCase("united");
        System.out.println(united);

        List<Region> regionByCountryContainingIgnoreCaseOrderByCountry = regionRepository.findByCountryContainingIgnoreCaseOrderByCountry("asia");
        System.out.println(regionByCountryContainingIgnoreCaseOrderByCountry);

        List<Region> top2ByCountry = regionRepository.findTop2ByCountry("Canada");
        System.out.println(top2ByCountry);

        System.out.println("==================Department===============");

        List<Department> toys = departmentRepository.findByDepartment("Toys");
        System.out.println(toys);

        List<Department> outdoors = departmentRepository.findByDivisionIs("Outdoors");
        System.out.println(outdoors);

        List<Department> hea = departmentRepository.findDistinctTop2ByDivisionContains("Hea");
        System.out.println(hea);

        List<Department> entertainment = departmentRepository.findDistinctTop2ByDivisionContains("Entertainment");
        System.out.println(entertainment);

        System.out.println("==================Employees===============");
        List<Employee> byEmail = employeeRepository.findByEmail("npointona@vistaprint.com");
        System.out.println(byEmail);
        List<Employee> byFirstNameAndLastNameAndEmailIsNotNull = employeeRepository.findByFirstNameAndLastNameAndEmailIsNotNull("Edna", "Ervin");
        System.out.println(byFirstNameAndLastNameAndEmailIsNotNull);

        List<Employee> distinctTop3BySalaryLessThanEqual = employeeRepository.findDistinctTop3BySalaryLessThanEqualOrderBySalaryDesc(80000);
        System.out.println(distinctTop3BySalaryLessThanEqual);

        List<Employee> byEmailIsNull = employeeRepository.findByEmailIsNull();
        byEmailIsNull.forEach(e -> System.out.println(e.getEmail() + " -> " + e.getFirstName()));

        System.out.println("================JPQL====================");
        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println(employeeRepository.getEmployeeSalary());
        if (employeeRepository.getEmployeeSalary("lolifauntx@dailymotion.com").isPresent())
            System.out.println(employeeRepository.getEmployeeSalary("lolifauntx@dailymotion.com").get());


        System.out.println(employeeRepository.getEmployeeDetails(".com", "Modesty"));

        System.out.println("================Course====================");
        List<Course> repositoryByCategory = courseRepository.findByCategory("Spring");
        System.out.println(repositoryByCategory);

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println(courseRepository.existsByCategory("Spring"));

        System.out.println("Stream");
        System.out.println(courseRepository.streamByCategory("Spring").collect(Collectors.toList()));

        System.out.println("================Native SQL====================");
        System.out.println("employeeRepository.readEmployeeDetailBySalary(95313) = " + employeeRepository.readEmployeeDetailBySalary(95313));

        Optional<List<Course>> spring = courseRepository.findAllByCategoryAndRatingGraterThat("Spring", 4);
        System.out.println(spring);

        employeeRepository.updateEmployee("testemail",1);
    }
}
