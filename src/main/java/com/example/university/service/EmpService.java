package com.example.university.service;

import com.example.university.domain.CommonResponse;
import com.example.university.domain.entity.Emp;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {
    CommonResponse findAll();
    CommonResponse findByAge();
//    CommonResponse getResource();
}
