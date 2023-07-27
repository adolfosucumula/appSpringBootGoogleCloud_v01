package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEntity extends BaseEntity{
    
    @Column(name = "name")
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
