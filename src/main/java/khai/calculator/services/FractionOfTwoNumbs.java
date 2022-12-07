package khai.calculator.services;

import khai.calculator.operations.DivideInterface;

public class FractionOfTwoNumbs implements DivideInterface {
    private double divisible;
    private double divisor;
    /**
     * Divides the divisible number by the divisor
     *
     * @param divisible divisible number
     * @param divisor   divisor
     * @return fraction
     */
    @Override
    public double divide() throws ArithmeticException {
        return this.divisible / this.divisor;
    }

    @Override
    public double getDivisible() {
        return divisible;
    }

    @Override
    public void setDivisible(double divisible) {
        this.divisible = divisible;
    }

    @Override
    public double getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

}
