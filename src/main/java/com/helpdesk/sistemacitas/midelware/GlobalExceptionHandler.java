package com.helpdesk.sistemacitas.midelware;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(NoHandlerFoundException ex) {
        return "error/404";
    }
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Log the exception
        e.printStackTrace();
        return "error/500"; // Vista personalizada para el error 500
    }
}