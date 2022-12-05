package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome employee";
    }

    @GetMapping("/add")
    public String addemployee(){
        return "Add employee";
    }

    @GetMapping("/search")
    public String searchemployee(){
        return "Search employee";
    }

    @GetMapping("/edit")
    public String editemployee(){
        return "Edit employee";
    }


}
