
package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.controllers;

import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models.User;
import com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/rest-api/user")
public class apiUserController{

    @Autowired
    private UserRepository userRep;

    @GetMapping()
    public List<User> getUsers(){
        return (List<User>) userRep.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public List<User> getUser(@PathVariable Long id){
        User user = userRep.findById(id).get();
        List<User> list =new ArrayList<>();
        list.add(user);
        return list;
    }


    @PostMapping
    public String save(@RequestBody User entity){
        try{
            userRep.save(entity);
            return "Data created successfull!";
        }catch(Exception e){
            return "Operation failed. \n"+e.getMessage();
        }
    }

    @PutMapping(value = "/update/{id}")
    public String update(@PathVariable Long id, @RequestBody User entity){
        try{
            User update = userRep.findById(id).get();
                update.setUserName(entity.getUsername());
                update.setEmail(entity.getEmail());
                update.setPassword(entity.getPassword());
                update.setStatus(entity.getStatus());

                userRep.save(update);
            return "Data created successfull!";
        }catch(Exception e){
            return "Operation failed.\n"+e.getMessage();
        }
    }

    @DeleteMapping(value = "/del/{id}")
    public boolean delete(@PathVariable Long id){
        try{
            User delete = userRep.findById(id).get();
            userRep.delete(delete);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}