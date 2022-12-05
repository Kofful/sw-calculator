package khai.calculator.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void square() {
        Square square = new Square();
        assertEquals(1, square.square(1), 0);
    }

    @Test
    public void squareOfTwo() {
        Square square = new Square();
        assertEquals(4, square.square(2), 0);
    }

    @Test
    public void squareOfThree() {
        Square square = new Square();
        assertEquals(9, square.square(3), 0);
    }

    @Test
    public void squareOfTwelve() {
        Square square = new Square();
        assertEquals(144, square.square(12), 0);
    }

    @Test
    public void squareOfFifty() {
        Square square = new Square();
        assertEquals(2500, square.square(50), 0);
    }

    @Test
    public void squareOfOneHundred() {
        Square square = new Square();
        assertEquals(10000, square.square(100), 0);
    }
}