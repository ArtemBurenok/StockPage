package com.example.StockPage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

}
