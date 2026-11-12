package com.spring.spring_rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a student entity in the database.
 * Maps student information to the student table.
 */
@Entity
@Table(name = "student")
public class Student {

    /** Unique identifier for the student. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** First name of the student. */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /** Last name of the student. */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /** Email address of the student. */
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    /**
     * Default constructor required by JPA.
     */
    public Student() {
    }

    /**
     * Constructs a Student entity with the provided information.
     *
     * @param id the unique identifier of the student
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param email the student's email address
     */
    public Student(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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