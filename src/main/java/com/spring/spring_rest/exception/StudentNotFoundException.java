package com.spring.spring_rest.exception;

/**
 * Custom exception thrown when a requested student is not found.
 * Extends RuntimeException to handle student-related errors.
 */
public class StudentNotFoundException extends RuntimeException {

    /** Serial version UID for serialization compatibility. */
    private static final long serialVersionUID = -2690100046087976236L;

    /**
     * Constructs a StudentNotFoundException with a message and cause.
     *
     * @param message the error message describing the exception
     * @param cause the underlying cause of the exception
     */
    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a StudentNotFoundException with an error message.
     *
     * @param message the error message describing the exception
     */
    public StudentNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a StudentNotFoundException with a cause.
     *
     * @param cause the underlying cause of the exception
     */
    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}