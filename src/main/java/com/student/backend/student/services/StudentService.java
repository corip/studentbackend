package com.student.backend.student.services;

import com.student.backend.student.dao.StudentRepository;
import com.student.backend.student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student> lsStudent;
        lsStudent = (List<Student>) studentRepository.findAll();
        return lsStudent; //test
    }
}
