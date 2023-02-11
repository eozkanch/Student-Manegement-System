package com.Student.Management.System;

import com.Student.Management.System.Entitiy.Student;
import com.Student.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;



	@Override
	public void run (String ...args) throws Exception{
		Student student1=new Student(1l,"Ahmet","Canli","ahmetcanli@gimail.com");
		studentRepository.save(student1);
		Student student2=new Student(2L,"Veli","Cansiz","velicansiz@gimail.com");
		studentRepository.save(student2);
		Student student3=new Student(3L,"Ayse","Ermis","ayseermis@gimail.com");
		studentRepository.save(student3);

	}
}

