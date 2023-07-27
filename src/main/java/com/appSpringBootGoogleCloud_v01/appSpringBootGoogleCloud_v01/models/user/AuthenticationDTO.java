package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.user;


public final class AuthenticationDTO {
    
    private String login;
    private String password;

    public AuthenticationDTO(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String login(){
        return login;
    }

    public String password(){
        return password;
    }
}
