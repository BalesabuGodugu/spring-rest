package com.example.springrest.controller;

import com.example.springrest.domain.Customer;
import com.example.springrest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping(value = "/all")
    public List<Customer> getAllCustomers(){

        return service.getAllCustomers();

    }
}
