package com.eschool.management.dao;

import com.eschool.management.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface StudentRepository extends JpaRepository<Students, Integer> {
}
