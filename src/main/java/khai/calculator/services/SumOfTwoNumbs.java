package khai.calculator.services;

import khai.calculator.operations.SumInterface;

public class SumOfTwoNumbs implements SumInterface {
    /**
     * Counts sum of two additions
     *
     * @param firstAddition  first addition
     * @param secondAddition second addition
     * @return sum
     */
    @Override
    public double sum(double firstAddition, double secondAddition) {
        return firstAddition + secondAddition;
    }
}
