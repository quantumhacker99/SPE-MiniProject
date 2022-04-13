package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calc.scientific_calculator.ScientificCalculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private double delta = 1e-10;

    @Test
    public void testFactorialtruePositive()
    {
        assertEquals(24, ScientificCalculator.factorial(4), delta);
    }

    @Test
    public void testFactorialFalsePositive(){
        assertNotEquals(30, ScientificCalculator.factorial(4),delta);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
