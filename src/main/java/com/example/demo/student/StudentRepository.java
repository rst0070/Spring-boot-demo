package com.example.demo.student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import java.util.*;

import javax.transaction.Transactional;

@Repository
public interface StudentRepository 
    extends JpaRepository<Student, Long>{
    
    @Query("select s from Student s where s.email = ?1")
    Collection<Student> findStudentByEmail(String email);

    // transactional, Modifying 을 꼭 추가해줘야함.
    //https://stackoverflow.com/questions/44022076/jparepository-not-supported-for-dml-operations-delete-query
    @Transactional
    @Modifying
    @Query("delete from Student s where s.email = ?1")
    void deleteByEmail(String email);
}
