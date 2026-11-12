package com.spring.spring_rest.entity;

/**
 * Represents an error response for student REST API requests.
 * Contains the HTTP status, error message, and timestamp.
 */
public class StudentErrorResponse {

    /** HTTP status code of the error. */
    private int status;

    /** Description of the error. */
    private String message;

    /** Time when the error occurred. */
    private long timeStamp;

    /**
     * Default constructor for StudentErrorResponse.
     */
    public StudentErrorResponse() {
    }

    /**
     * Constructs a StudentErrorResponse with error details.
     *
     * @param status the HTTP status code
     * @param message the error message
     * @param timeStamp the time when the error occurred
     */
    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    /**
     * Gets the HTTP status code.
     *
     * @return the HTTP status code
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the HTTP status code.
     *
     * @param status the HTTP status code to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Gets the error message.
     *
     * @return the error message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the error message.
     *
     * @param message the error message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the timestamp of the error.
     *
     * @return the error timestamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the timestamp of the error.
     *
     * @param timeStamp the error timestamp to set
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}