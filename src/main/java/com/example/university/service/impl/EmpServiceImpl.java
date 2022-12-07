package com.example.university.service.impl;

import com.example.university.domain.CommonResponse;
import com.example.university.domain.entity.Emp;
import com.example.university.domain.entity.Resource;
import com.example.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpServiceImpl implements EmpService {
    private final RestTemplate restTemplate;

    String url = "https://dummy.restapiexample.com/api/v1/employees";

    @Autowired
    public EmpServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CommonResponse findAll() {
        Resource ls = restTemplate.getForObject(url, Resource.class);
        return new CommonResponse(0, new Date(), ls.getEmp());
    }

    @Override
    public CommonResponse findByAge() {
        Resource ls = restTemplate.getForObject(url, Resource.class);
        ArrayList<Emp> emps = ls.getEmp();

        List<Emp> byAge = emps
                .stream()
                .filter(e -> Integer.valueOf(e.getEmployee_age()) > 30)
                .collect(Collectors.toList());
        return new CommonResponse(0,new Date(), byAge);
    }

}
