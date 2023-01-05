package com.niraj.sms;

import com.niraj.sms.entity.Student;
import com.niraj.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

    @Autowired
    private StudentRepository sr;
    @Override
    public void run(String... args) throws Exception {
        Student std1 = new Student("Niraj", "Khadka", "niraj.khadka.np@outlook.com");
        sr.save(std1);
        
        Student std2 = new Student("Amul", "Mittal", "amul.mittal@gmail.com");
        sr.save(std2);
        
        Student std3 = new Student("Rojina", "Manandhar", "rosy.rojina@gmail.com");
        sr.save(std3);
    }

}
