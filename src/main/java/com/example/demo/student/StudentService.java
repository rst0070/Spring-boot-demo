package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    
    public List<Student> getList(){
        return repository.findAll();
    }

    public void saveNewStudent(Student student){
        if(isEmailExist(student.getEmail())) throw new IllegalArgumentException("ID is already exist.");
        repository.save(student);
    }

    public void deleteStudent(String email){
        if(!isEmailExist(email)) throw new IllegalArgumentException("The student does not exist.");
        repository.deleteByEmail(email);
    }
    public boolean isEmailExist(String email){
        Collection<Student> col = repository.findStudentByEmail(email);
        if( col.size() > 0) return true;
        return false;
    }
}
