package com.example.calculator.service;

import com.example.calculator.exception.ZeroDivideException;
import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plusPositive(){
        int actual = calculatorService.plus(10,2);
        assertEquals(12, actual);
    }
    @Test
    void plusNegative(){
        int actual = calculatorService.plus(-10,-2);
        assertEquals(-12, actual);
    }
    @Test
    void minusPositive(){
        int actual = calculatorService.minus(10,2);
        assertEquals(8, actual);
    }
    @Test
    void minusNegative(){
        int actual = calculatorService.minus(-10,-2);
        assertEquals(-8, actual);
    }
    @Test
    void multiplyPositive(){
        int actual = calculatorService.multiply(10,2);
        assertEquals(20, actual);
    }
    @Test
    void multiplyNegative(){
        int actual = calculatorService.multiply(-10,-2);
        assertEquals(20, actual);
    }
    @Test
    void dividePositive() throws Exception{
        int actual = calculatorService.divide(10,2);
        assertEquals(5, actual);
    }
    @Test
    void divideNegative() throws Exception{
        int actual = calculatorService.divide(-10,-2);
        assertEquals(5, actual);
    }
    @Test
    void divideZero(){
        assertThrows(ZeroDivideException.class, ()->calculatorService.divide(1, 0));
    }

}
