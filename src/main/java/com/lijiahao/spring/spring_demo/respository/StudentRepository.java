package com.lijiahao.spring.spring_demo.respository;

import com.lijiahao.spring.spring_demo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
}
