package com.alex.jdeveloper;

import static org.junit.jupiter.api.Assertions.*;

class TestSimpleCalculator {

    @org.junit.jupiter.api.Test
    void test1() {
        SimpleCalculator m = new SimpleCalculator();
        int num1 = 3, num2 = 4, expectedSum = 7;
        assertEquals(expectedSum, m.AddTwoNumbers(num1, num2));
    }

    @org.junit.jupiter.api.Test
    void test2() {
        SimpleCalculator m = new SimpleCalculator();
        int num1 = 10, num2 = 9, expectedSum = 19;
        assertEquals(expectedSum, m.AddTwoNumbers(num1, num2));
    }
}