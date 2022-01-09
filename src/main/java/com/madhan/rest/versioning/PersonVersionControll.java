/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Madhankumar Selvaraj
 */
@RestController
public class PersonVersionControll {

@GetMapping("/v1/person")
public PersonV1 personv1() {
    return new PersonV1("Madhan");

}

@GetMapping("/v2/person")
public PersonV2 personv2() {
    return new PersonV2(new Name("Madhankumar", "Selvaraj"));
}

@GetMapping(path="/person/param",params ="version=1")
public PersonV1 paramv1(){
    return new PersonV1("Madhan");
}


@GetMapping(path = "/person/param",params = "version=2")
public PersonV2 paramv2(){
    return new PersonV2(new Name("Madhankumar", "Selvaraj"));
}


@GetMapping(path="/person/header",headers = "X-API-VERSION=1")
public PersonV1 headerV1(){
    return new PersonV1("Madhan");
}


@GetMapping(path = "/person/header",headers = "X-API-VERSION=2")
public PersonV2 headerV2(){
    return new PersonV2(new Name("Madhankumar", "Selvaraj"));
}

@GetMapping(path="/person/produces",produces = "application/v1+json")
public PersonV1 producesV1(){
    return new PersonV1("Madhan");
}


@GetMapping(path = "/person/produces",produces = "application/v2+json")
public PersonV2 producesV2(){
    return new PersonV2(new Name("Madhankumar", "Selvaraj"));
}


}
