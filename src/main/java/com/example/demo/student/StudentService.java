package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    
    public List<Student> getList(){
        return repository.findAll();
    }

    public void saveNewStudent(Student student){
        if(isEmailExist(student)) throw new IllegalArgumentException("ID is already exist.");
        repository.save(student);
    }

    public boolean isEmailExist(Student student){
        String email = student.getEmail();
        Collection<Student> col = repository.findStudentByEmail(email);
        if( col.size() > 0) return true;
        return false;
    }
}
