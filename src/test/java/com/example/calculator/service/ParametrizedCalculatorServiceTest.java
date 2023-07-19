package com.example.calculator.service;

import com.example.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> dataForPlus(){
        return Stream.of(
                Arguments.of(10, 2, 12),
                Arguments.of(-12, 10, -2),
                Arguments.of(-10, -2, -12)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus(int a, int b, int expected){
        assertEquals(expected, calculatorService.plus(a, b));
    }

    static Stream<Arguments> dataForMinus(){
        return Stream.of(
                Arguments.of(10, 2, 8),
                Arguments.of(-12, 10, -22),
                Arguments.of(-10, -2, -8)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus(int a, int b, int expected){
        assertEquals(expected, calculatorService.minus(a, b));
    }

    static Stream<Arguments> dataForMultiply(){
        return Stream.of(
                Arguments.of(10, 2, 20),
                Arguments.of(-12, 10, -120),
                Arguments.of(-10, -2, 20)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply(int a, int b, int expected){
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    static Stream<Arguments> dataForDivide(){
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(-120, 10, -12),
                Arguments.of(-10, -2, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForDivide")
    void divide (int a, int b, int expected) throws Exception {
        assertEquals(expected, calculatorService.divide(a, b));
    }
}
