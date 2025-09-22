package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorComponentTest {

    private final Calculator calc = new Calculator();

    @Test
    public void add_twoPositives_returnsSum() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void add_withZero_returnsSameNumber() {
        assertEquals(5, calc.add(5, 0));
    }

    @Test
    public void add_twoNegatives_returnsNegativeSum() {
        assertEquals(-9, calc.add(-4, -5));
    }

    @Test
    public void subtract_twoPositives_returnsDifference() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void multiply_twoNegatives_returnsPositive() {
        assertEquals(20, calc.multiply(-4, -5));
    }

    @Test
    public void multiply_withZero_returnsZero() {
        assertEquals(0, calc.multiply(100, 0));
    }

    @Test
    public void divide_twoPositives_returnsQuotient() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        calc.divide(10, 0);
    }
}
