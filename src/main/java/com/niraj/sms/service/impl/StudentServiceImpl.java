/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.sms.service.impl;

import com.niraj.sms.entity.Student;
import com.niraj.sms.repository.StudentRepository;
import com.niraj.sms.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niraj Khadka
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }
    
    
    
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    
}
