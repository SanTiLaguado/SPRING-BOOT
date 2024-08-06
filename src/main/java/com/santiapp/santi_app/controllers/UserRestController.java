package com.santiapp.santi_app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.santiapp.santi_app.models.User;
import com.santiapp.santi_app.models.dto.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v2/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Santiago", "Laguado Osorio", "santi@gmail");

        userDto.setTitle("Desarrollando con SpringBoot");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list-details")
    public List<User> listdetails(){
        User user1 = new User("Santiago", "Laguado", "santi@gmail.com");
        User user2 = new User("Julio", "Garcia", null);
        User user3 = new User("Juan", "Perez", null);
        
        List<User> lstUSers = Arrays.asList(user1,user2,user3);
        return lstUSers;        
    }

    

    // @GetMapping("/v2/details")
    // public Map<String,Object> details(){
    //     User user = new User("Santiago", "Laguado");
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("title", "Pruebas SpringBoot");
    //     body.put("user", user);
    //     return body;
    // }
}
