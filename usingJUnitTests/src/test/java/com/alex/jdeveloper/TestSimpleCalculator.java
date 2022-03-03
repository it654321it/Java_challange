package com.alex.jdeveloper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSimpleCalculator {

    @Test
    void twoMultiplyTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        
        int num1 = 2, num2 = 2, expected = 4;

        assertTrue(calculator.MultiplyTwoNumbers(num1, num2) == expected);
    }

    @Test
    void threeMultiplyTenShouldEqualThirty() {
        SimpleCalculator calculator = new SimpleCalculator();

        int num1 = 3, num2 = 10, expected = 30;

        assertEquals(expected, calculator.MultiplyTwoNumbers(num1, num2));
    }
}