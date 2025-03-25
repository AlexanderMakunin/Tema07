package com.alexandermakunin.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateLettersException extends InvalidPropertiesFormatException {
    public InvalidPlateLettersException(String message) {
        super(message);
    }
}
