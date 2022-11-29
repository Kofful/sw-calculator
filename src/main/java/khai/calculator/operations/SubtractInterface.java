package khai.calculator.operations;

public interface SubtractInterface {
    /**
     * Subtracts the subtracted number from the reduced number
     *
     * @return difference
     */
    double subtract();
    void setReduced(double reduced);
    double getReduced();
    void setSubtracted(double subtracted);
    double getSubtracted();
}
