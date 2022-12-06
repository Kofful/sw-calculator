package khai.calculator.operations;

public interface SumInterface {
    /**
     * Counts sum of two additions
     *
     * @param firstAddition first addition
     * @param secondAddition second addition
     * @return sum
     */
    double sum(double firstAddition, double secondAddition);

    void setFirstAddition(double firstAddition);

    double getFirstAddition();

    void setSecondAddition(double secondAddition);

    double getSecondAddition();
}
