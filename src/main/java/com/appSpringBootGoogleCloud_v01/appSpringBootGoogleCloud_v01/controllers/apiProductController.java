package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.controllers;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories.ProductRepository;
import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.product.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/product")
public class apiProductController {
    
    @Autowired
    ProductRepository repository;

    @GetMapping
    public List<Product> getProducts(){
        return repository.findAll();
    }
    
}
