package khai.calculator.services;

import khai.calculator.operations.SumInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTwoNumbsTest {

    private SumInterface sumService;
    
    @Before
    public void setUp() {
        this.sumService = new SumOfTwoNumbs();
    }

    @Test
    public void sumOfTwoNegativeNumbers() {
        assertEquals(-11, sumService.sum(-5, -6), 0);
        assertEquals(-11, sumService.sum(-6, -5), 0);
    }

    @Test
    public void sumOfOneNegativeAndPositiveNumber() {
        assertEquals(0, sumService.sum(-5, 5), 0);
        assertEquals(0, sumService.sum(5, -5), 0);
    }

    @Test
    public void sumOfDoubleNumbers() {
        assertEquals(49.9, sumService.sum(50, -0.1), 0);
        assertEquals(49.9, sumService.sum(-0.1, 50), 0);
        assertEquals(50.1, sumService.sum(50, 0.1), 0);
    }

    @Test
    public void sumOfTens() {
        assertEquals(60, sumService.sum(10, 50), 0);
        assertEquals(60, sumService.sum(50, 10), 0);
    }
}