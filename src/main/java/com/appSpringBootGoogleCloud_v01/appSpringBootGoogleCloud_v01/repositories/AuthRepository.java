
package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthRepository extends JpaRepository<User, Long>{

    UserDetails findByLogin(String login);
    
}