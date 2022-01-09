/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author Madhankumar Selvaraj
 */
@ControllerAdvice
@RestController
public class CustomizeException extends ResponseEntityExceptionHandler {

@ExceptionHandler(Exception.class)
public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest wr) {
    ExceptionResponse exceptionResp
            = new ExceptionResponse(new Date(), ex.getMessage(),
                    wr.getDescription(false));
    return new ResponseEntity(exceptionResp, HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(UserNotFound.class)
public final ResponseEntity<Object> handleUserNotFoundException(Exception ex, WebRequest wr) {
    ExceptionResponse exceptionResp
            = new ExceptionResponse(new Date(), ex.getMessage(),
                    wr.getDescription(false));
    return new ResponseEntity(exceptionResp, HttpStatus.NOT_FOUND);
}

@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    ExceptionResponse exceptionResp
            = new ExceptionResponse(new Date(), ex.getMessage(),
                    ex.getBindingResult().toString());
    return new ResponseEntity(exceptionResp, HttpStatus.BAD_REQUEST);
}


}
