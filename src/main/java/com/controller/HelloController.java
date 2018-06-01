package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by farhans on 5/30/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello";
    }

}
