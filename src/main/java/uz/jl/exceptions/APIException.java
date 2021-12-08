package uz.jl.exceptions;

import uz.jl.enums.http.HttpStatus;

/**
 * @author Elmurodov Javohir, Mon 12:27 PM. 11/29/2021
 */
public class APIException extends Exception {
    private final Integer code;

    public APIException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public APIException(String message, HttpStatus status) {
        super(message);
        this.code = status.getCode();
    }
}
