/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.Date;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class Users {

private Integer id;
private String name;
private Date birthdate;

public Users(Integer id, String name, Date birthdate) {
    this.id = id;
    this.name = name;
    this.birthdate = birthdate;
}

public Users() {
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Date getBirthdate() {
    return birthdate;
}

public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
}

@Override
public String toString() {
    return "Users{" + "id=" + id + ", name=" + name + ", birthdate=" + birthdate + '}';
}
}
