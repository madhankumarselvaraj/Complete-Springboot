/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Madhankumar Selvaraj
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFound extends RuntimeException {

public UserNotFound(String message) {
    super(message);

}

}
