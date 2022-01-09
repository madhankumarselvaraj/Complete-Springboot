/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.rest.webservices.restfullwebservices.Helloworld;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Madhankumar Selvaraj
 */
@RestController
public class HelloworldController {

@Autowired
private MessageSource messageSource;

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

@GetMapping(path = "/helloworldinternationalize")
public String helloworldinternationalize() {
    return messageSource.getMessage("local.goodmorning.message", null,"No Message configure in specific Language", LocaleContextHolder.getLocale());

}

}
