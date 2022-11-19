package khai.calculator.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionOfTwoNumbsTest {

    @Test
    public void divide() {
        FractionOfTwoNumbs fractionOfTwoNumbs = new FractionOfTwoNumbs();
        assertEquals(0.5, fractionOfTwoNumbs.divide(1, 2), 0);
    }

    @Test
    public void divideOfOneAndFour() {
        FractionOfTwoNumbs fractionOfTwoNumbs = new FractionOfTwoNumbs();
        assertEquals(0.25, fractionOfTwoNumbs.divide(1, 4), 0);
    }

    @Test
    public void divideOfTwoBigNums() {
        FractionOfTwoNumbs fractionOfTwoNumbs = new FractionOfTwoNumbs();
        assertEquals(0.184F, fractionOfTwoNumbs.divide(12, 65), 0.001);
    }

    @Test
    public void divideOfTwoAndThree() {
        FractionOfTwoNumbs fractionOfTwoNumbs = new FractionOfTwoNumbs();
        assertEquals(0.6666, fractionOfTwoNumbs.divide(2, 3), 0.0001);
    }

    @Test
    public void divideOfThreeAndFour() {
        FractionOfTwoNumbs fractionOfTwoNumbs = new FractionOfTwoNumbs();
        assertEquals(0.75, fractionOfTwoNumbs.divide(3, 4), 0.0001);
    }
}