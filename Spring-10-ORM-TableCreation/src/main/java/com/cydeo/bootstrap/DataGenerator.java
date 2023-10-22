package com.cydeo.bootstrap;
import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {
    CarRepository carRepository;
    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(CarRepository carRepository, EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW", "M5");
        Car c2 = new Car("Civic", "CR");
        Car c3 = new Car("Audi", "Q8");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

        Faker faker = new Faker();
        String[] departmentNames = {
                "Human Resources",
                "Marketing",
                "Finance",
                "IT",
                "Sales",
                "Operations",
                "Research and Development"
        };
        Gender[] genders = Gender.values();
        for (int i = 0; i < 10; i++) {
            Department department = new Department(departmentNames[faker.random().nextInt(departmentNames.length)]);
            Employee employee = new Employee(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.random().nextInt(1, 1000) + "google@gmail.com",
                    LocalDate.now(),
                    department,
                    genders[faker.random().nextInt(genders.length)],
                    faker.random().nextInt(50_000, 250_000),
                    faker.address().zipCode()
            );
            departmentRepository.save(department);
            employeeRepository.save(employee);
        }

    }
}
