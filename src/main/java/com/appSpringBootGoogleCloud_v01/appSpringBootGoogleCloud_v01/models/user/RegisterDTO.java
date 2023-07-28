package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.user;

public class RegisterDTO {
    
    private String fullname;
    private String password;
    private String status;
    private String login;
    private UserRole role;

    public RegisterDTO(String fullname, String password, String login, UserRole role, String status){
        this.fullname = fullname;
        this.password = password;
        this.login = login;
        this.role = role;
        this.status = status;
    }

    
    public String fullname(){
        return this.fullname;
    }

    public String login(){
        return this.login;
    }
    public String password(){
        return this.password;
    }
    public UserRole role(){
        return this.role;
    }
    public String status(){
        return this.status;
    }
}
