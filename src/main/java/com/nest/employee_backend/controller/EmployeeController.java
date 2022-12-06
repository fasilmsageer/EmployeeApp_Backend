package com.nest.employee_backend.controller;

import com.nest.employee_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @PostMapping("/")
    public String welcome(){
        return "Welcome employee";
    }

    @PostMapping(path = "/addemp", consumes = "application/json", produces = "application/json")
    public String addemployee(@RequestBody Employee e){

        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobnumber().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "Employee added Successfully";
    }

    @PostMapping("/search")
    public String searchemployee(){
        return "Search employee";
    }

    @PostMapping("/edit")
    public String editemployee(){
        return "Edit employee";
    }

    @GetMapping("/view")
    public String viewemployee(){
        return "View employee";
    }

    @PostMapping("/delete")
    public String deleteemployee(){
        return "Delete employee";
    }


}
