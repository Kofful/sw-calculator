package khai.calculator.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifferenceOfTwoNumbsTest {

    @Test
    public void subtract() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(-8296, differenceOfTwoNumbs.subtract(2938, 11234), 0);
    }

    @Test
    public void subtractOfTwoAndTwo() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(0, differenceOfTwoNumbs.subtract(2, 2), 0);
    }

    @Test
    public void subtractOfPositiveAndNegativeNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(3777, differenceOfTwoNumbs.subtract(2544, -1233), 0.0001);
    }

    @Test
    public void subtractOfTwoBigNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(62, differenceOfTwoNumbs.subtract(98, 36), 0);
    }

    @Test
    public void subtractOfFloatNums() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(-0.76F, differenceOfTwoNumbs.subtract(2.365F, 3.125F), 0.1);
    }

    @Test
    public void subtractWithError() {
        DifferenceOfTwoNumbs differenceOfTwoNumbs = new DifferenceOfTwoNumbs();
        assertEquals(-0.76F, differenceOfTwoNumbs.subtract(5.1F, 3.125F), 0.22254678);
    }
}