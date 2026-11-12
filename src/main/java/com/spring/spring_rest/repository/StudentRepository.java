package com.spring.spring_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring_rest.entity.Student;

/**
 * Repository interface for managing Student entities.
 * Provides built-in CRUD operations through JpaRepository.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}