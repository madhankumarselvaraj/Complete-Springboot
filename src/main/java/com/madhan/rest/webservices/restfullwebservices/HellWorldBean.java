/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class HellWorldBean {

private String message;

public HellWorldBean(String message) {
    this.message = message;
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

@Override
public String toString() {
    return "HellWorldBean{" + "message=" + message + '}';
}

}
