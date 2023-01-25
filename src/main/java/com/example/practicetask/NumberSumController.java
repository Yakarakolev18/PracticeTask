package com.example.practicetask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum-numbers")
public class NumberSumController {

    private SumNumService sumNumbersService;

    @Autowired
    public NumberSumController(SumNumService sumNumbersService) {
        this.sumNumbersService = sumNumbersService;
    }

    @GetMapping
    public int getSum(@RequestParam int n) {
        return sumNumbersService.calculateSum(n);
    }
}