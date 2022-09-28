package khai.calculator.services;

import khai.calculator.operations.MultiplyInterface;

public class ProductOfTwoNumbers implements MultiplyInterface {
    /**
     * Counts product of two multipliers
     *
     * @param firstMultiplier  first multiplier
     * @param secondMultiplier second multiplier
     * @return product
     */
    @Override
    public double multiply(double firstMultiplier, double secondMultiplier) {
        return firstMultiplier * secondMultiplier;
    }
}
