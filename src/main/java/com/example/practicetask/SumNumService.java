package com.example.practicetask;

import org.springframework.stereotype.Service;

@Service
public class SumNumService {

    public int theSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}