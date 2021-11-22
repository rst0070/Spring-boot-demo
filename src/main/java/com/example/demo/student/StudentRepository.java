package com.example.demo.student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import java.util.*;

@Repository
public interface StudentRepository 
    extends JpaRepository<Student, Long>{
    
    @Query("select s from Student s where s.email = ?1")
    Collection<Student> findStudentByEmail(String email);
}
