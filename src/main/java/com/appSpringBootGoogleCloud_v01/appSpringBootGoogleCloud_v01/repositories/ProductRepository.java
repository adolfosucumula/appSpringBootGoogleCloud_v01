package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.product.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
