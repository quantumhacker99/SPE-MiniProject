package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import calc.scientific_calculator.ScientificCalculator;

public class ScientificCalculatorTest{
    private double delta = 1e-10;

    @Test
    public void testSqrtTruePositive(){
        assertEquals(2, ScientificCalculator.sqrt(4), delta);
    }

    @Test
    public void testSqrtFalsePositive(){
        assertNotEquals(3, ScientificCalculator.sqrt(4),delta);
    }

    @Test
    public void testFactorialTruePositive()
    {
        assertEquals(24, ScientificCalculator.factorial(4), delta);
    }

    @Test
    public void testFactorialFalsePositive(){
        assertNotEquals(30, ScientificCalculator.factorial(4),delta);
    }

    @Test
    public void testLnTruePositive()
    {
        assertEquals(1, ScientificCalculator.ln(Math.E), delta);
    }

    @Test
    public void testLnFalsePositive(){
        assertNotEquals(3, ScientificCalculator.ln(Math.E),delta);
    }

    @Test
    public void testPowTruePositive()
    {
        assertEquals(20.25, ScientificCalculator.pow(4.5,2), delta);
    }

    @Test
    public void testPowFalsePositive(){
        assertNotEquals(20, ScientificCalculator.pow(4.5,2),delta);
    }


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}