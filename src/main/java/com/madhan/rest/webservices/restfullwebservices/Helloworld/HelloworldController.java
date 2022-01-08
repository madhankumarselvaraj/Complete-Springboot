/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Madhankumar Selvaraj
 */
@RestController
public class HelloworldController {

@GetMapping(path = "/helloworld")
public String hellowordMethod() {
    return "Hello Worlds";
}

@GetMapping(path = "/helloworld-bean")
public HellWorldBean helloworldBean() {
    return new HellWorldBean("Hello world beans");

}

@GetMapping(path = "helloworld-bean/pathvariable/{name}")
public HellWorldBean hellworldPathVariable(@PathVariable String name) {
    return new HellWorldBean("Hello world " + name);
}
}
