package com.alexandermakunin.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateLengthException extends InvalidPropertiesFormatException {
    public InvalidPlateLengthException(String message) {
        super(message);
    }
}
