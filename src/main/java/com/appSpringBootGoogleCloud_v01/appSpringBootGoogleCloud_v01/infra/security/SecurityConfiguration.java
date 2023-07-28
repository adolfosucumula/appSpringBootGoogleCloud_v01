package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    
    //Security Filter Chain for the user authentication. This method is used to verify and validate
    //if the user has permission to make some request. if true the rout request is avoid 
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            
            //Defining the authorized http requests 
            .authorizeHttpRequests(authorize -> authorize
            //Request function to authorize and avoid user to access the home, login and register page with no authentication 
                
                .antMatchers(HttpMethod.POST, "/auth/login").permitAll()
                .antMatchers(HttpMethod.POST, "/auth/register").permitAll()
                //Request function to authorize to access Products when is authenticated
                .antMatchers(HttpMethod.GET, "/find/{id}").authenticated()
                .antMatchers(HttpMethod.POST, "/product").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/rest-api/user").authenticated()
                //.anyRequest().authenticated()
        )
        .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }

    //This is a method used to encrypt the password 
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
