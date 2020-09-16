package com.sumitaccess007;

import com.sumitaccess007.entities.Employee;
import com.sumitaccess007.repositories.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringBootDataModuleImplementation1ApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void shouldCreateEmployee_Success() {
        Employee employee = new Employee();
        employee.setName("Yannick");
        employee.setSalary((double) 1000);
        employee = employeeRepository.save(employee);
        Assertions.assertTrue(employee != null);
    }

    @Test
    void fetchEmployeeCount_NotToBeZero() {
        long empCount = employeeRepository.count();
        Assertions.assertTrue(empCount  > 0);
    }

    @Test
    void updateEmployeeNameById_Success() {
        Employee employee = new Employee();
        employee.setId(4);
        employee.setName("JMC");
        employee = employeeRepository.save(employee);
        Assertions.assertTrue(employee != null);
    }

}
