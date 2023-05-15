package com.example.studentms;

import com.example.studentms.entity.Student;
import com.example.studentms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmsApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public  void run(String... args) throws Exception{
//		Student student1=new Student("Hansika","Mannapperuma","hm@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2=new Student("Iresha","Mannapperuma","Im@gmail.com");
//		studentRepository.save(student2);

	}

}
