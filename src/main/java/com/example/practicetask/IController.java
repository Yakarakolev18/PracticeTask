package com.example.practicetask;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
