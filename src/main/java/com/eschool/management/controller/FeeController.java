package com.eschool.management.controller;

import com.eschool.management.entity.StudentFee;
import com.eschool.management.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/fees")
    public class FeeController {

        @Autowired
        private FeeService feeService;

        @GetMapping
        public List<StudentFee> getAllFees() {
            return feeService.getAllFees();
        }

        @GetMapping("/student/{studentId}")
        public List<StudentFee> getFeesByStudentId(@PathVariable Integer studentId) {
            return feeService.getFeesByStudentId(studentId);
        }

        @PostMapping
        public ResponseEntity<StudentFee> createFee(@RequestBody StudentFee fee) {
            StudentFee createdFee = feeService.saveFee(fee);
            return ResponseEntity.ok(createdFee);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteFee(@PathVariable Integer id) {
            feeService.deleteFee(id);
            return ResponseEntity.noContent().build();
        }
    }

