/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

@GetMapping(path = "/users/{id}")
public EntityModel<Users> getSpecificUser(@PathVariable Integer id) {
    Users usr = usrDao.findOne(id);
    if (usr == null) {
        throw new UserNotFound("id-" + id);
    }

    EntityModel<Users> entityModel = EntityModel.of(usr);
    return entityModel;
}

@PostMapping(path = "/users")
public ResponseEntity saveUsers(@Valid @RequestBody Users user) {
    Users usr = usrDao.saveUsers(user);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usr.getId()).toUri();
    return ResponseEntity.created(uri).build();
}

@DeleteMapping(path = "/users/{id}")
public Users deleteUser(@PathVariable Integer id) {
    Users usr = usrDao.deleteOne(id);
    return usr;
}

}
