
package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models;


public enum UserRole{

    ADMIN("admin"),

    USER("user");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String role(){
        return role;
    }

}