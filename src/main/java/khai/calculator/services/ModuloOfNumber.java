package khai.calculator.services;

import khai.calculator.operations.ModuloInterface;

public class ModuloOfNumber implements ModuloInterface {
    /**
     * Getting the module from a number
     *
     * @param number
     * @param module
     * @return module of number
     */
    @Override
    public double mod(double number, double module) {
        return number % module;
    }
}
