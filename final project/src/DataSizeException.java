package org.javapractices.project;

public class DataSizeException extends RuntimeException {
    public DataSizeException() {
    }

    public DataSizeException(String message) {
        super(message);
    }

    public DataSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataSizeException(Throwable cause) {
        super(cause);
    }
}
