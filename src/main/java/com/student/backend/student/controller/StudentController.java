package com.student.backend.student.controller;

import com.student.backend.student.entities.Student;
import com.student.backend.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<Student> getStudents(){
        System.out.println("hola");
        return studentService.getStudents();
    }

    @PostMapping
    public void setStudents(){
        System.out.println("Hola");
    }
}
