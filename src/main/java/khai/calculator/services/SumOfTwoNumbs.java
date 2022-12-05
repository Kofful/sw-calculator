package khai.calculator.services;

import khai.calculator.operations.SumInterface;

public class SumOfTwoNumbs implements SumInterface {

    private double firstAddition;

    private double secondAddition;

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

    @Override
    public void setFirstAddition(double firstAddition) {
        this.firstAddition = firstAddition;
    }

    @Override
    public void setSecondAddition(double secondAddition) {
        this.secondAddition = secondAddition;
    }

    @Override
    public double getFirstAddition() {
        return firstAddition;
    }

    @Override
    public double getSecondAddition() {
        return secondAddition;
    }
}
