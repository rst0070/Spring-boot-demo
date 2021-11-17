package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="student")
public class StudentController {
    
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> hello(){
        return service.getList();
    }
}
