package org.example.Loging.project;

public class FileMaxSizeReachedException extends RuntimeException {
    String message;

    public FileMaxSizeReachedException(String message1) {
        this.message = message1;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
