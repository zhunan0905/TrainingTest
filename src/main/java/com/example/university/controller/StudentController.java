package com.example.university.controller;

import com.example.university.domain.CommonResponse;
import com.example.university.domain.entity.Student;
import com.example.university.exception.ResourceNotFoundException;
import com.example.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/student", method = {RequestMethod.GET})
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonResponse> findStuById(@PathVariable String id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<CommonResponse> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    //path: /student, method: post ,  create student
    @PostMapping
    public ResponseEntity<CommonResponse> insert(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.insert(student), HttpStatus.CREATED);
    }

    //TODO: /{id} , method : put,  update student
    @PutMapping("/{id}/{name}")
    public ResponseEntity<CommonResponse> update(@PathVariable String id, @PathVariable String name) {
//        if(name == null) {
//            return new ResponseEntity<>(studentService.update(id, null), HttpStatus.OK);
//        }
//        else {
//            return new ResponseEntity<>(studentService.update(id, name), HttpStatus.OK);
//        }
        return new ResponseEntity<>(studentService.update(id, name), HttpStatus.OK);

    }

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<CommonResponse> handleNotFound() {
//        return new ResponseEntity<>(
//                    new CommonResponse(-1, new Date(), "resource not found"),
//                    HttpStatus.NOT_FOUND
//                );
//    }
}
