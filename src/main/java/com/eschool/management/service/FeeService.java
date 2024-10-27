package com.eschool.management.service;

import com.eschool.management.dao.FeeRepository;
import com.eschool.management.entity.StudentFee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeService {

    @Autowired
    private FeeRepository feeRepository;

    public List<StudentFee> getAllFees() {
        return feeRepository.findAll();
    }

    public List<StudentFee> getFeesByStudentId(Integer studentId) {
        return feeRepository.findByStudentId(studentId);
    }

    public StudentFee saveFee(StudentFee fee) {
        return feeRepository.save(fee);
    }

    public void deleteFee(Integer id) {
        feeRepository.deleteById(id);
    }
}
