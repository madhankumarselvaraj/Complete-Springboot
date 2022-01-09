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
public class PersonV2 {

private Name name;

public PersonV2(Name name) {
    this.name = name;
}

public PersonV2() {
}

public Name getName() {
    return name;
}

public void setName(Name name) {
    this.name = name;
}

}
