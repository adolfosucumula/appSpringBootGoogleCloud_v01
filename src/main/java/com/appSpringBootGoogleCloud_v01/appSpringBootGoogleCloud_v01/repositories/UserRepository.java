package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
