package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.services;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories.AuthRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService implements UserDetailsService{

    @Autowired
    AuthRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return repository.findByLogin(username);
    }
    
}
