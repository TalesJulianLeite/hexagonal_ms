package com.leite.tales.default_hexagonal.adapters.out.controller.exception;

import com.leite.tales.default_hexagonal.domain.exceptions.user.UserAlreadyExistsException;
import com.leite.tales.default_hexagonal.domain.exceptions.user.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    ProblemDetail handleNumeroNaoInformadoException(UserNotFoundException e) {
        ProblemDetail userProblemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getLocalizedMessage());
        userProblemDetail.setTitle("Usuário não encontrado!");
        userProblemDetail.setDetail("É preciso informar um código de usuário válido!");
        userProblemDetail.setProperty("StackTrace", e.getStackTrace());
        userProblemDetail.setProperty("Categoria", "Plataforma");
        userProblemDetail.setProperty("TimeStamp", Instant.now());
        return userProblemDetail;
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    ProblemDetail handleUsuarioExistenteException(UserAlreadyExistsException e) {
        ProblemDetail userProblemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.CONFLICT, e.getLocalizedMessage());
        userProblemDetail.setTitle("Usuário informado não pode ser inserido pois já existe!");
        userProblemDetail.setDetail("É preciso informar um usuário inexistente!");
        userProblemDetail.setProperty("StackTrace", e.getStackTrace());
        userProblemDetail.setProperty("Categoria", "Plataforma");
        userProblemDetail.setProperty("TimeStamp", Instant.now());
        return userProblemDetail;
    }
}
