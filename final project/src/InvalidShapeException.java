package org.javapractices.project;

public class InvalidShapeException extends RuntimeException {
    public InvalidShapeException() {
    }

    public InvalidShapeException(String message) {
        super(message);
    }

    public InvalidShapeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidShapeException(Throwable cause) {
        super(cause);
    }
}
