package org.skypro.skyshop.exceptions;


public class InvalidSearchPatternException extends RuntimeException {

    public InvalidSearchPatternException(String message) {
        super(message);
    }

    public InvalidSearchPatternException(String message, Throwable cause) {
        super(message, cause);
    }
}