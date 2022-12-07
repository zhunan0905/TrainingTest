package com.example.university.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private ArrayList<Emp> emp;

    public ArrayList<Emp> getEmp() {
        return emp;
    }
}
