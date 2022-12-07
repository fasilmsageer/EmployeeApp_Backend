package com.nest.employee_backend.dao;

import com.nest.employee_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`, `companyname`, `designation`, `mobnumber`, `name`, `password`, `salary`, `username`, `empcode` FROM `employees` WHERE `empcode` = :empcode",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") String empcode);

}
