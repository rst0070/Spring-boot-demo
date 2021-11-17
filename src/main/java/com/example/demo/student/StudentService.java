package com.example.demo.student;

import org.springframework.stereotype.Service;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    
    public List<Student> getList(){
        return List.of(
            new Student("wonbin", "wonbin@example.com", LocalDate.of(2000, Month.JULY, 11), 21)
        );
    }
}
