package com.leite.tales.default_hexagonal.domain.exceptions.user;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {
        super(message);
    }
}
