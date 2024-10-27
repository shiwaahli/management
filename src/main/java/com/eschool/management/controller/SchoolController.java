package com.eschool.management.controller;

import com.eschool.management.entity.Students;
import com.eschool.management.entity.Teacher;
import com.eschool.management.service.StudentService;
import com.eschool.management.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private  StudentService studentService;

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/home")
    public String home()
    {
        return "Hello World";
    }

    @GetMapping("/get/all/students")
    public List<Students> getAllStudents()
    {

        return studentService.getAllStudents();
    }

    @GetMapping("/get/{studentID}")
    public Students getStudent(@PathVariable Integer studentID)
    {
        return studentService.getStudent(studentID);
    }

    @PostMapping(path="/add/student")
    public ResponseEntity<Students> addStudent(@RequestBody Students students)
    {
        try {
           Students sAdd= studentService.addStudent(students);
            return ResponseEntity.ok(sAdd);
        } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    
    @GetMapping("/get/all/teachers")
    public List<Teacher> getAllTeachers()
    {
        return teacherService.getAllTeacher();
    }
    
    
}
