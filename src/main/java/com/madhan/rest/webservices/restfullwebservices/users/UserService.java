/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Madhankumar Selvaraj
 */
@RestController
public class UserService {

@Autowired
private UsersDAO usrDao;

@GetMapping(path = "/users")
public List<Users> getAllusers() {
    return usrDao.finAll();
}

@GetMapping(path="/users/{id}")
public  Users getSpecificUser(@PathVariable Integer id){
    return usrDao.findOne(id);
}


@PostMapping(path="/users")
public void saveUsers(@RequestBody Users user){
    usrDao.saveUsers(user);
}



}
