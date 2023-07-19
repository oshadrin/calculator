package com.example.calculator.controller;


import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String greeting(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return String.format("%s + %s = %s", a, b, calculatorService.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return String.format("%s - %s = %s", a, b, calculatorService.minus(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return String.format("%s * %s = %s", a, b, calculatorService.multiply(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a,@RequestParam("num2") int b){
        try {
            return String.format("%s / %s = %s", a, b, calculatorService.divide(a, b));
        }catch (Exception e) {
            return "Деление на ноль запрещено";
        }
    }
}
