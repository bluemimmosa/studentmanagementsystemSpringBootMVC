/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.sms.repository;

import com.niraj.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Niraj Khadka
 */
//no need to add @Repository annotation coz JpaRepository has default impl
//class called SimpleJpaRepository which has already annotated with @Repository
//@Transactional also not needed as it has been implemented in
// SimpleJpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
