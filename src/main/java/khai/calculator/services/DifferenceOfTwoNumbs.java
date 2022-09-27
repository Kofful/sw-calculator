package khai.calculator.services;

import khai.calculator.operations.SubtractInterface;

public class DifferenceOfTwoNumbs implements SubtractInterface {
    /**
     * Subtracts the subtracted number from the reduced number
     *
     * @param reduced    reduced number
     * @param subtracted subtracted number
     * @return difference
     */
    @Override
    public double subtract(double reduced, double subtracted) {
        return reduced - subtracted;
    }
}
