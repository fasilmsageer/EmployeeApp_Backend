package com.nest.employee_backend.dao;

import com.nest.employee_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`, `companyname`, `designation`, `mobnumber`, `name`, `password`, `salary`, `username`, `empcode` FROM `employees` WHERE `empcode` LIKE %:empcode%",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") String empcode);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employees` WHERE `id` =:id",nativeQuery = true)
    void deleteEmployee(@Param("id")Integer id);

}
