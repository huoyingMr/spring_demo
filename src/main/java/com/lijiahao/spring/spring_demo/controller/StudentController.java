package com.lijiahao.spring.spring_demo.controller;

import com.lijiahao.spring.spring_demo.entity.Student;
import com.lijiahao.spring.spring_demo.respository.StudentRepository;
import com.lijiahao.spring.spring_demo.service.StudentService;
import com.lijiahao.spring.spring_demo.service.serviceImpl.StudentServiceImpl;
import org.hibernate.annotations.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    private Student addStudent(Student student)
    {
        return studentService.addStudent(student);
    }
    @GetMapping("/all")
    private List<Student> findAllStudent(Model model)
    {
        return studentService.findAll();
    }
    @GetMapping("/getbyid/{id}")
    private Student findStudentById(@PathVariable("id") Integer id)
    {
        return studentService.findStudentById(id);
    }
    @PutMapping("/updatestu")
    private Student updateStudent(Student student)
    {
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/del/{id}")
    private void delById(@PathVariable("id") Integer id)
    {
        studentService.deleteById(id);
    }
}
