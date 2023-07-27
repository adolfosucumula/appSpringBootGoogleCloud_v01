package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.controllers;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.user.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "auth")
public class AuthController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

   // UsernamePasswordAuthenticationToken usernamePassword;

    /*@PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody AuthenticationDTO data){
        usernamePassword = 
        new UsernamePasswordAuthenticationToken(data.login(), data.password());
        this.authenticationManager.authenticate(usernamePassword);
        
        return ResponseEntity.ok().build();
    }*/

    
}
