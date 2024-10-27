package com.eschool.management.service;

import com.eschool.management.dao.StudentRepository;
import com.eschool.management.dao.TeacherRepository;
import com.eschool.management.entity.Students;
import com.eschool.management.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher()
    {
        return teacherRepository.findAll();
    }

    public Teacher getTeacher(Long id) {
        return teacherRepository.findById(id).get();
    }

    public void addTeacher(Teacher teacher) {

        teacherRepository.save(teacher);
    }
}
