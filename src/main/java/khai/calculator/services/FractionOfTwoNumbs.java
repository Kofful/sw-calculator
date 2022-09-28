package khai.calculator.services;

import khai.calculator.operations.DivideInterface;

public class FractionOfTwoNumbs implements DivideInterface {
    /**
     * Divides the divisible number by the divisor
     *
     * @param divisible divisible number
     * @param divisor   divisor
     * @return fraction
     */
    @Override
    public double divide(double divisible, double divisor) throws ArithmeticException {
        return divisible / divisor;
    }
}
