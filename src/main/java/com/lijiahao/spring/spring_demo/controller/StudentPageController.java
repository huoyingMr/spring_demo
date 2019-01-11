package com.lijiahao.spring.spring_demo.controller;

import com.lijiahao.spring.spring_demo.entity.Student;
import com.lijiahao.spring.spring_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("web")
public class StudentPageController {
    @Autowired
    private StudentService studentService;
    private Integer id;
    @GetMapping("/all")
    public String findAllStudent(Model model)
    {
        List<Student> lists=studentService.findAll();
        model.addAttribute("stus",lists);
        return "student/studentlist";
    }
    //@DeleteMapping("/del/{id}")
    @RequestMapping("/del/{id}")
    public String deleteById(Model model,@PathVariable("id") Integer id)
    {
        studentService.deleteById(id);
        List<Student> lists=studentService.findAll();
        model.addAttribute("stus",lists);
        //return "redirect:student/studentlist";
        return "redirect:/web/all";
        //return "forward:/web/all";
    }
    @RequestMapping("/update/{id}")
    public String toUpdate(Model model,@PathVariable("id") Integer id)
    {
        this.id=id;
        Student student=studentService.findStudentById(id);
        model.addAttribute("student",student);
        return "student/updatestu";
    }
    @RequestMapping("/add")
    public String toAdd()
    {
        return "student/addstudent";
    }
    @RequestMapping("/toupdate")
    //@ResponseBody
    public String Update(Model model,Student student)
    {
//        Student student=new Student();
          //student.setStuID(id);
//        student.setStuName(name);
//        student.setStuPhone(telnum);
//        student.setStuAddress(address);
        studentService.addStudent(student);
        List<Student> lists=studentService.findAll();
        model.addAttribute("stus",lists);
        return "student/studentlist";
    }
    @RequestMapping("/toadd")
    public String AddStudent(Model model,Student student)
    {
//        Student student=new Student();
//        student.setStuName(name);
//        student.setStuPhone(telnum);
//        student.setStuAddress(address);
        studentService.addStudent(student);
        List<Student> lists=studentService.findAll();
        model.addAttribute("stus",lists);
        return "student/studentlist";
    }
}
