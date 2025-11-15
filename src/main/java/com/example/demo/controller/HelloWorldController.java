package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
	
    @GetMapping("/")
    public String sayHello(@RequestParam(name = "mensaje", required = false, defaultValue = "mundo") String message, Model model) {
        model.addAttribute("mensaje", message);
        return "MessageView"; // Refers to MessageView.html in templates folder
    }

}
