package com.nest.employee_backend.dao;

import com.nest.employee_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
