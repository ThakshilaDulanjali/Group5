package com.io.fitandlift.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  :   Pramod Dhananjaya
 * Date        :   12/14/2020
 */
@RestController
@CrossOrigin(origins = "localhost://localhost:4200")
public class UserController {
    @GetMapping("/home")
    public String greetings(){
        return "Welcome to Gym Management System";
    }
}
