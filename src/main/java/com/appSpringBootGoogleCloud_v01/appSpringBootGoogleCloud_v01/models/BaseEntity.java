package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.*;

@MappedSuperclass
public class BaseEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public boolean isNew(){
        return this.id == null;
    }
}
