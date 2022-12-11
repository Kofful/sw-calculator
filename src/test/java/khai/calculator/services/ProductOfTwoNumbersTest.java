package khai.calculator.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductOfTwoNumbersTest {
    private ProductOfTwoNumbers productService;

    @Before
    public void setUp() {
        this.productService = new ProductOfTwoNumbers();
    }

    @Test
    public void productOfTwoNegativeNumbers() {
        productService.setFirstMultiplier(-5);
        productService.setSecondMultiplier(-5);
        assertEquals(25, productService.multiply(), 0);
    }

    @Test
    public void productOfOneNegativeAndPositiveNumber() {
        productService.setFirstMultiplier(-5);
        productService.setSecondMultiplier(5);
        assertEquals(-25, productService.multiply(), 0);
        productService.setFirstMultiplier(5);
        productService.setSecondMultiplier(-5);
        assertEquals(-25, productService.multiply(), 0);
    }

    @Test
    public void productOfDoubleNumbers() {
        productService.setFirstMultiplier(50);
        productService.setSecondMultiplier(-0.1);
        assertEquals(-5, productService.multiply(), 0);
        productService.setFirstMultiplier(-0.1);
        productService.setSecondMultiplier(50);
        assertEquals(-5, productService.multiply(), 0);
        productService.setFirstMultiplier(50);
        productService.setSecondMultiplier(0.1);
        assertEquals(5, productService.multiply(), 0);
    }

    @Test
    public void productOfTens() {
        productService.setFirstMultiplier(10);
        productService.setSecondMultiplier(50);
        assertEquals(500, productService.multiply(), 0);
        productService.setFirstMultiplier(50);
        productService.setSecondMultiplier(10);
        assertEquals(500, productService.multiply(), 0);
    }


}