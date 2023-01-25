package com.example.practicetask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class NumController {

    private NumService numbersService;

    @Autowired
    public NumController(NumService numbersService) {
        this.numbersService = numbersService;
    }

    @GetMapping
    public List<Integer> getNumbers(@RequestParam int n) {
        return numbersService.divideByThree(n);
    }
}