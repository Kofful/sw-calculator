package khai.calculator.operations;

public interface DivideInterface {
    /**
     * Divides the divisible number by the divisor
     *
     * @param divisible divisible number
     * @param divisor divisor
     * @return fraction
     */
    double divide();
    double getDivisible();
    void setDivisible(double divisible);
    double getDivisor();
    void setDivisor(double divisor);
}
