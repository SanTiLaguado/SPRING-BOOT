package com.santiapp.santi_app.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.santiapp.santi_app.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserRestController {

    @GetMapping("/v2/details")
    public Map<String,Object> details(){
        User user = new User("Santiago", "Laguado");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Pruebas SpringBoot");
        body.put("user", user);
        return body;
    }
}
