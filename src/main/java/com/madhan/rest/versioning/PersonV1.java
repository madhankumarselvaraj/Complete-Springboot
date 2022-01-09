/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.versioning;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class PersonV1 {

private String name;

public PersonV1() {
}

public PersonV1(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

}
