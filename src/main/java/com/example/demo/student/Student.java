package com.example.demo.student;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name="STUDENT")
@Entity
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column( name = "student_id")
    private long id;

    @Column( name = "student_name")
    private String name;
    @Column( name = "email")
    private String email;
    @Column( name = "dob")
    private LocalDate dob;

    @Transient
    private int age;

    public Student(long id, String name, String email, LocalDate dob){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = LocalDate.now().getYear() - dob.getYear();
    }

    public Student(String name, String email, LocalDate dob){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = LocalDate.now().getYear() - dob.getYear();
    }

   
}
