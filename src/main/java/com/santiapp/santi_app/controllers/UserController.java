package com.santiapp.santi_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.santiapp.santi_app.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("mensaje", "Holaa desde backend!");
        User user = new User("Santiago", "Laguado");
        model.addAttribute("user", user);
        return "details";
    }
    

}
