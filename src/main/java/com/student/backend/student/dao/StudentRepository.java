package com.student.backend.student.dao;

import com.student.backend.student.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
