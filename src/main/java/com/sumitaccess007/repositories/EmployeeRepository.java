package com.sumitaccess007.repositories;

import com.sumitaccess007.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
