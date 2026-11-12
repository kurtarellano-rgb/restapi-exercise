package com.spring.spring_rest.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object (DTO) for student information.
 * Used to transfer student data between application layers.
 */
public class StudentDto {

    private Long id;

    @Size(min = 2, max = 50, message = "Must be 2 to 50 characters.")
    private String firstName;

    @Size(min = 2, max = 50, message = "Must be 2 to 50 characters.")
    private String lastName;

    @Email(message = "Email is required and should be valid")
    private String email;

    /**
     * Constructs a StudentDto with student information.
     *
     * @param id the unique identifier of the student
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param email the student's email address
     */
    public StudentDto(Long id, String firstName, 
                                String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Default constructor for StudentDto.
     */
    public StudentDto() {
    }

    /**
     * Gets the student's ID.
     *
     * @return the student's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the student's ID.
     *
     * @param id the student ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the student's first name.
     *
     * @return the student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the student's first name.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the student's last name.
     *
     * @return the student's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the student's last name.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the student's email address.
     *
     * @return the student's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email address.
     *
     * @param email the email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}