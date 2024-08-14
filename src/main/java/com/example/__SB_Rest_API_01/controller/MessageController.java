package com.example.__SB_Rest_API_01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    @GetMapping("/welcome")
    public String welcomeMsg(){
        return "welcome to first class of Rest API";
    }


    @GetMapping("/greet")
    ResponseEntity<String> greetMsg(){
        return new ResponseEntity<>("good morning", HttpStatus.OK);
    }
}
