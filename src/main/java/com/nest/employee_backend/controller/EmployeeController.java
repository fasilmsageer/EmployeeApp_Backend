package com.nest.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

    @PostMapping("/")
    public String welcome(){
        return "Welcome employee";
    }

    @PostMapping("/add")
    public String addemployee(){
        return "Add employee";
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
