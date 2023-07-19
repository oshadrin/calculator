package com.example.calculator.service.impl;

import com.example.calculator.exception.ZeroDivideException;
import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws Exception {
        if (b == 0){
            throw new ZeroDivideException();
        }
        return a / b;
    }
}
