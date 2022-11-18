package khai.calculator.services;

import khai.calculator.operations.SquareInterface;

public class Square implements SquareInterface {

    /**
     * Raising number to a square
     *
     * @param number number
     * @return square
     */
    @Override
    public double square(double number) {
        return number * number;
    }
}
