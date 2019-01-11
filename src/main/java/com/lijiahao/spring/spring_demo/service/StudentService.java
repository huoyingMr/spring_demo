package com.lijiahao.spring.spring_demo.service;

import com.lijiahao.spring.spring_demo.entity.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);
    public Student findStudentById(Integer id);
    public Student updateStudent(Student student);
    public List<Student> findAll();
    public void deleteById(Integer id);
}
