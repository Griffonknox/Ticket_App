package com.example.groupproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        // the string index will be looked for in src/main/resources/templates
        return "index.html";
    }
}