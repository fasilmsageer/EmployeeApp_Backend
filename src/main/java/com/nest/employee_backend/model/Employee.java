package com.nest.employee_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String designation;
    private String salary;
    private String companyname;
    private String mobnumber;
    private String username;
    private String password;

    public Employee(){

    }

    public Employee(int id, String name, String designation, String salary, String companyname, String mobnumber, String username, String password) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyname = companyname;
        this.mobnumber = mobnumber;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getMobnumber() {
        return mobnumber;
    }

    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
