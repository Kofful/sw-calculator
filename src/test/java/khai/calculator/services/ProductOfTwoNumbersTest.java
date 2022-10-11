package khai.calculator.services;

import khai.calculator.operations.MultiplyInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfTwoNumbersTest {
    private MultiplyInterface multiplyService;

    @Before
    public void setUp() {
        this.multiplyService = new ProductOfTwoNumbers();
    }

    @Test
    public void productOfTwoNegativeNumbers() {
        assertEquals(25, multiplyService.multiply(-5, -5), 0);
    }

    @Test
    public void productOfOneNegativeAndPositiveNumber() {
        assertEquals(-25, multiplyService.multiply(-5, 5), 0);
        assertEquals(-25, multiplyService.multiply(5, -5), 0);
    }

    @Test
    public void productOfDoubleNumbers() {
        assertEquals(-5, multiplyService.multiply(50, -0.1), 0);
        assertEquals(-5, multiplyService.multiply(-0.1, 50), 0);
        assertEquals(5, multiplyService.multiply(50, 0.1), 0);
    }

    @Test
    public void productOfTens() {
        assertEquals(500, multiplyService.multiply(10, 50), 0);
        assertEquals(500, multiplyService.multiply(50, 10), 0);
    }


}