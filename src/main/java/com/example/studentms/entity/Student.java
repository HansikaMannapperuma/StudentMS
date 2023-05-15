package com.example.studentms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Student(String firstName, String lastName, String email) {
        //this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //@Column(name="first_name" , nullable=false)
    private String firstName;
    private String lastName;
    private String email;
}
