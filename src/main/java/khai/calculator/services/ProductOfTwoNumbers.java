package khai.calculator.services;

import khai.calculator.operations.MultiplyInterface;

public class ProductOfTwoNumbers implements MultiplyInterface {

    private double firstMultiplier;

    private double secondMultiplier;

    /**
     * Counts product of two multipliers
     *
     * @return product
     */
    @Override
    public double multiply() {
        return getFirstMultiplier() * getSecondMultiplier();
    }

    public double getFirstMultiplier() {
        return firstMultiplier;
    }

    public void setFirstMultiplier(double firstMultiplier) {
        this.firstMultiplier = firstMultiplier;
    }

    public double getSecondMultiplier() {
        return secondMultiplier;
    }

    public void setSecondMultiplier(double secondMultiplier) {
        this.secondMultiplier = secondMultiplier;
    }
}
