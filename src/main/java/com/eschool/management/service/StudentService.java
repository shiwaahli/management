package com.eschool.management.service;

import com.eschool.management.dao.StudentRepository;
import com.eschool.management.entity.Students;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> getAllStudents()
    {
        return studentRepository.findAll();
    }

    public Students getStudent(Integer studentID) {
        return studentRepository.findById(studentID).get();
    }

    public Students addStudent(Students students) {

        return studentRepository.save(students);
    }
}
