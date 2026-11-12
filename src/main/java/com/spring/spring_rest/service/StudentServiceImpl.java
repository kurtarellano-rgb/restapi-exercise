package com.spring.spring_rest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.spring_rest.dto.StudentDto;
import com.spring.spring_rest.entity.Student;
import com.spring.spring_rest.exception.StudentNotFoundException;
import com.spring.spring_rest.mapper.StudentMapper;
import com.spring.spring_rest.repository.StudentRepository;

/**
 * Service implementation for managing student records.
 * Provides CRUD operations and handles student-related business logic.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepo;

    /**
     * Constructs a StudentServiceImpl with the required repository.
     *
     * @param studentRepo the repository used to access student records
     */
    public StudentServiceImpl(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    /**
     * Creates and saves a new student record.
     *
     * @param theStudentDto the student data to be created
     * @return the saved student as a StudentDto
     */
    @Override
    public StudentDto createStudent(StudentDto theStudentDto) {

        Student theStudent = StudentMapper.mapToStudent(theStudentDto);
        Student saved = studentRepo.save(theStudent);

        return StudentMapper.mapToStudentDto(saved);
    }

    /**
     * Retrieves a student record by its ID.
     *
     * @param theId the ID of the student to retrieve
     * @return the student details as a StudentDto
     * @throws StudentNotFoundException if the student does not exist
     */
    @Override
    public StudentDto getStudentById(Long theId) {

        Student student = studentRepo.findById(theId)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student id " + theId + " not found!"));

        return StudentMapper.mapToStudentDto(student);
    }

    /**
     * Retrieves all student records from the database.
     *
     * @return a list of StudentDto objects containing student information
     */
    @Override
    public List<StudentDto> getAllStudents() {

        List<Student> students = studentRepo.findAll();

        return students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    /**
     * Updates an existing student record with the provided information.
     *
     * @param theId the ID of the student to update
     * @param theStudentDto the updated student information
     * @return the updated student as a StudentDto
     * @throws StudentNotFoundException if the student does not exist
     */
    @Override
    public StudentDto updateStudent(Long theId, StudentDto theStudentDto) {

        Student student = studentRepo.findById(theId)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student id " + theId + " not found!"));

        student.setFirstName(theStudentDto.getFirstName());
        student.setLastName(theStudentDto.getLastName());
        student.setEmail(theStudentDto.getEmail());

        Student saved = studentRepo.save(student);

        return StudentMapper.mapToStudentDto(saved);
    }

    /**
     * Partially updates an existing student record.
     * Only fields with non-null values are updated.
     *
     * @param theId the ID of the student to update
     * @param theStudentDto the student data containing the updates
     * @return the updated student as a StudentDto
     * @throws StudentNotFoundException if the student does not exist
     */
    @Override
    public StudentDto patchStudent(Long theId, StudentDto theStudentDto) {

        Student student = studentRepo.findById(theId)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student id " + theId + " not found!"));

        // Update only the fields that contain non-null values.
        if (theStudentDto.getFirstName() != null) {
            student.setFirstName(theStudentDto.getFirstName());
        }

        if (theStudentDto.getLastName() != null) {
            student.setLastName(theStudentDto.getLastName());
        }

        if (theStudentDto.getEmail() != null) {
            student.setEmail(theStudentDto.getEmail());
        }

        Student saved = studentRepo.save(student);

        return StudentMapper.mapToStudentDto(saved);
    }

    /**
     * Deletes a student record by its ID.
     *
     * @param theId the ID of the student to delete
     * @throws StudentNotFoundException if the student does not exist
     */
    @Override
    public void deleteStudentById(Long theId) {

        studentRepo.findById(theId)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student id " + theId + "not found!"));

        studentRepo.deleteById(theId);
    }
}