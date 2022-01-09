/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.users;

import java.net.URI;
import java.util.List;
import java.util.Optional;
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
public class UserJPAservice {

@Autowired
private UserRepositry userRep;

@GetMapping(path = "/jpa/users")
public List<Users> getAllusers() {
    return userRep.findAll();
}

@GetMapping(path = "/jpa/users/{id}")
public EntityModel<Users> getSpecificUser(@PathVariable Integer id) {
    Optional<Users> usr = userRep.findById(id);
    if (!usr.isPresent()) {
        throw new UserNotFound("id-" + id);
    }

    EntityModel<Users> entityModel = EntityModel.of(usr.get());
    return entityModel;
}

@PostMapping(path = "/jpa/users")
public ResponseEntity saveUsers(@Valid @RequestBody Users user) {
    Users usr = userRep.save(user);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usr.getId()).toUri();
    return ResponseEntity.created(uri).build();
}

@DeleteMapping(path = "/jpa/users/{id}")
public void deleteUser(@PathVariable Integer id) {
    userRep.deleteById(id);

}

@GetMapping(path = "/jpa/users/{id}/posts")
public List<Post> getAllPost(@PathVariable int id) {
    Optional<Users> post = userRep.findById(id);
    if (!post.isPresent()) {
        throw new UserNotFound("id " + id);
    }
    List<Post> posted = post.get().getPost();
    return posted;
}

}
