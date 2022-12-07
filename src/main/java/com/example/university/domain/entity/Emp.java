package com.example.university.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Emp {

    private String id;

    private String employee_name;
    private String employee_salary;
    private String employee_age;
    private String profile_image;


    public String getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
}
