/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Madhankumar Selvaraj
 */
@Entity
public class Post {

@Id
@GeneratedValue
private Integer id;

private String description;

@ManyToOne(fetch = FetchType.LAZY)
@JsonIgnore
private Users usr;

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public Users getUsr() {
    return usr;
}

public void setUsr(Users usr) {
    this.usr = usr;
}

}
