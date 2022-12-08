package com.nest.employee_backend.controller;

import com.nest.employee_backend.dao.EmployeeDao;
import com.nest.employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @PostMapping("/")
    public String welcome(){
        return "Welcome employee";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp", consumes = "application/json", produces = "application/json")
    public String addemployee(@RequestBody Employee e){
        System.out.println(e.getEmpcode().toString());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobnumber().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        dao.save(e);
        return "Employee added Successfully";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchemp", consumes = "application/json", produces = "application/json")
    public List<Employee> SearchEmployee(@RequestBody Employee e){
        String empcode = String.valueOf(e.getEmpcode()) ;
        System.out.println(empcode);
        return (List<Employee>) dao.SearchEmployee(e.getEmpcode());
    }

    @PostMapping("/edit")
    public String editemployee(){
        return "Edit employee";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewemp")
    public List<Employee> viewemployee(){

        return (List<Employee>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path= "/deleteemp", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> deleteemployee(@RequestBody Employee e){

        String empid=String.valueOf(e.getId());
        System.out.println(empid);
        dao.deleteEmployee(e.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }


}
