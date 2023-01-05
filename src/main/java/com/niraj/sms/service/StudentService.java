/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.sms.service;

import com.niraj.sms.entity.Student;
import java.util.List;

/**
 *
 * @author Niraj Khadka
 */
public interface StudentService {
    
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
