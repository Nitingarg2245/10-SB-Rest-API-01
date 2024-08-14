package com.example.__SB_Rest_API_01.controller;

import com.example.__SB_Rest_API_01.Application;
import com.example.__SB_Rest_API_01.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @GetMapping(value = "/customer",produces = {MediaType.APPLICATION_JSON_VALUE ,MediaType.APPLICATION_XML_VALUE})
    public Customer getCustomer(){
        return new Customer(10,"Nitin",25);
    }

    @PostMapping(value = "/customer",consumes = {MediaType.APPLICATION_JSON_VALUE ,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        return new ResponseEntity<>("customer is saved ", HttpStatus.CREATED);
    }
}
