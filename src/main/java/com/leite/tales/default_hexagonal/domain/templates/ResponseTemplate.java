package com.leite.tales.default_hexagonal.domain.templates;

import org.springframework.http.HttpStatus;

public class ResponseTemplate<T> {

    private HttpStatus status;
    private Short statusCode;
    private String message;
    private T data;

    public ResponseTemplate() {}

    public ResponseTemplate(HttpStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.statusCode = (short) this.getStatus().value();
    }

    // Getters e Setters
    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Short getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Short statusCode) {
        this.statusCode = statusCode;
    }

    public static <T> ResponseTemplate<T> success(T data) {

        return new ResponseTemplate<>(HttpStatus.OK, "Success", data);
    }

    public static <T> ResponseTemplate<T> error(String message) {
        return new ResponseTemplate<>(HttpStatus.BAD_REQUEST, message, null);
    }

}
