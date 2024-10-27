package com.eschool.management.dao;

import com.eschool.management.entity.StudentFee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeeRepository extends JpaRepository<StudentFee, Integer> {
    List<StudentFee> findByStudentId(Integer studentId);
}