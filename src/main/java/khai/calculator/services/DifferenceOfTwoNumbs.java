package khai.calculator.services;

import khai.calculator.operations.SubtractInterface;

public class DifferenceOfTwoNumbs implements SubtractInterface {
    private double reduced;
    private double subtracted;
    /**
     * Subtracts the subtracted number from the reduced number
     *
     * @return difference
     */
    @Override
    public double subtract() {
        return this.reduced - this.subtracted;
    }

    @Override
    public void setReduced(double reduced) {
        this.reduced = reduced;
    }

    @Override
    public double getReduced() {
        return this.reduced;
    }

    @Override
    public void setSubtracted(double subtracted) {
        this.subtracted = subtracted;
    }

    @Override
    public double getSubtracted() {
        return this.subtracted;
    }


}
