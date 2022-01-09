/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *
 * @author Madhankumar Selvaraj
 */
@Entity
public class Users {

@Id
@GeneratedValue
private Integer id;

@Size(min = 2, message = "Name should atleast 2 character")
private String name;
@Past
private Date birthdate;

@OneToMany(mappedBy = "usr")
private List<Post> post;

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

public List<Post> getPost() {
    return post;
}

public void setPost(List<Post> post) {
    this.post = post;
}

@Override
public String toString() {
    return "Users{" + "id=" + id + ", name=" + name + ", birthdate=" + birthdate + '}';
}
}
