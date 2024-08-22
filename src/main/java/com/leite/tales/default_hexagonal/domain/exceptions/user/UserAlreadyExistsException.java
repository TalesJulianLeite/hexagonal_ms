package com.leite.tales.default_hexagonal.domain.exceptions.user;

public class UserAlreadyExistsException extends RuntimeException{

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
