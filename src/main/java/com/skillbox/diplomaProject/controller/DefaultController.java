package com.skillbox.diplomaProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
