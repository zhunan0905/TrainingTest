package com.example.university.controller;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handle(Exception ex,
                                         WebRequest request) {
        String bodyOfResponse = "Test";
        return handleExceptionInternal(ex, bodyOfResponse,
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
//    @ExceptionHandler(value = {Exception.class})
//    public String checkHandler(Exception ex) {
//        return "TEST";
//    }
}
