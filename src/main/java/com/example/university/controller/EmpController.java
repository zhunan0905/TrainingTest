package com.example.university.controller;

import com.example.university.domain.CommonResponse;
import com.example.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
public class EmpController {

    private final EmpService empService;

    @Autowired
    public EmpController(EmpService empService) {this.empService = empService;}

    @GetMapping
    public ResponseEntity<CommonResponse> findAll() {
        return new ResponseEntity<>(empService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/age")
    public ResponseEntity<CommonResponse> findByAge() {
        return new ResponseEntity<>(empService.findByAge(), HttpStatus.OK);
    }


}
