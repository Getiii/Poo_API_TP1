package com.maven.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdrController {

    @GetMapping("/adresse")
    public String addresse(){
        return "addresse";
    }
}
