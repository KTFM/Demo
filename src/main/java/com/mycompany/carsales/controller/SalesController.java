package com.mycompany.carsales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

    @GetMapping("/sales")
    public String home(Model model) {
        model.addAttribute("message", "");
        return "sales";
    }
}