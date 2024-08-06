package com.santiapp.santi_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.santiapp.santi_app.models.User;
import com.santiapp.santi_app.models.dto.UserDto;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("mensaje", "Holaa desde backend!");
        User user = new User("Santiago", "Laguado", "santi@gmail.com");
        User user2 = new User("Julio", "Garcia", null);

        UserDto user3 = new UserDto();

        user3.setTitle("Software Developer");
        user3.setUser(user);

        model.addAttribute("user", user);
        model.addAttribute("user2", user3);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Carlos", "Perez", "carlos@gmail.com"),
                new User("Martha", "Sanchez", "martha@gmail.com"),
                new User("Vicente", "Camargo", null));
        model.addAttribute("title", "Listado de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }

}
