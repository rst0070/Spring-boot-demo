package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="/")
public class StudentController {
    
    @Autowired
    private StudentService service;


    @GetMapping(path="get")
    public List<Student> hello(){
        return service.getList();
    }

    @PostMapping
    public String newStudent(@RequestBody Student student){
        service.saveNewStudent(student);
        return "redirect:/get";
    }
}
