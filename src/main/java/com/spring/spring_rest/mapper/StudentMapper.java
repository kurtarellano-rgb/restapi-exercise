package com.spring.spring_rest.mapper;

import com.spring.spring_rest.dto.StudentDto;
import com.spring.spring_rest.entity.Student;

/**
 * Provides mapping methods for transferring student data between layers.
 */
public class StudentMapper {

    /**
     * Converts a Student entity into a StudentDto object.
     *
     * @param theStudent the Student entity to convert
     * @return a StudentDto containing the student's information
     */
    public static StudentDto mapToStudentDto(Student theStudent) {

        return new StudentDto(
                theStudent.getId(),
                theStudent.getFirstName(),
                theStudent.getLastName(),
                theStudent.getEmail()
        );
    }

    /**
     * Converts a StudentDto object into a Student entity.
     *
     * @param theStudentDto the StudentDto object to convert
     * @return a Student entity containing the student's information
     */
    public static Student mapToStudent(StudentDto theStudentDto) {

        return new Student(
                theStudentDto.getId(),
                theStudentDto.getFirstName(),
                theStudentDto.getLastName(),
                theStudentDto.getEmail()
        );
    }
}