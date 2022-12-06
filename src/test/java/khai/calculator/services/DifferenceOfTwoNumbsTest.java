package khai.calculator.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifferenceOfTwoNumbsTest {

    @Test
    public void subtract() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        differenceOfTwoNumbs.setReduced(298);
        differenceOfTwoNumbs.setSubtracted(11234);
        assertEquals(-10936, differenceOfTwoNumbs.subtract(), 0);
    }

    @Test
    public void subtractOfTwoAndTwo() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        differenceOfTwoNumbs.setReduced(2);
        differenceOfTwoNumbs.setSubtracted(2);
        assertEquals(0, differenceOfTwoNumbs.subtract(), 0);
    }

    @Test
    public void subtractOfPositiveAndNegativeNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        differenceOfTwoNumbs.setReduced(2544);
        differenceOfTwoNumbs.setSubtracted(-1233);
        assertEquals(3777, differenceOfTwoNumbs.subtract(), 0.0001);
    }

    @Test
    public void subtractOfTwoBigNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        differenceOfTwoNumbs.setReduced(98);
        differenceOfTwoNumbs.setSubtracted(36);
        assertEquals(62, differenceOfTwoNumbs.subtract(), 0);
    }

    @Test
    public void subtractOfFloatNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        differenceOfTwoNumbs.setReduced(2.36F);
        differenceOfTwoNumbs.setSubtracted(1.125F);
        assertEquals(-0.76F, differenceOfTwoNumbs.subtract(), 10.1);
    }
/**
    @Test
    public void subtractWithError() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(-0.76F, differenceOfTwoNumbs.subtract(5.1F, 3.125F), 0.22254678);
    }
   */
}