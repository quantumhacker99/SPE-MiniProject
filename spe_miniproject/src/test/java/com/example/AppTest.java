package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calc.scientific_calculator.Calculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculator calculator = new Calculator();
    private double delta = 1e-10;

    @Test
    public void testFactorialtruePositive()
    {
        assertEquals(24, calculator.factorial(4), delta);
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
