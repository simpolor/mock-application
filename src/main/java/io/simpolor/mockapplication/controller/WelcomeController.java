package io.simpolor.mockapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping({"/", "/index", "/welcome"})
    public String welcome(){

        return "Mock-application";
    }
}
