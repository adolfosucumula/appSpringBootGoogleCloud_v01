package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.controllers;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.user.*;
import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories.AuthRepository;
import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "auth")
public class AuthController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    AuthRepository authRepository;

    @Autowired
    UserRepository userRepository;

    UsernamePasswordAuthenticationToken usernamePassword;

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody @Validated AuthenticationDTO data){
        usernamePassword = 
        new UsernamePasswordAuthenticationToken(data.login(), data.password());
        this.authenticationManager.authenticate(usernamePassword);
        
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/register")
    public ResponseEntity register(@RequestBody @Validated RegisterDTO data){
        if(this.authRepository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();
        
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(data.fullname(), data.login(), encryptedPassword, data.role());
        this.userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }
    
}
