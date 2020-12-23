package ge.edu.btu.impl;

import ge.edu.btu.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int g, int k) {
        return g + k;
    }
    @Override
    public int divide(int g, int k) {
        if (k == 0)
            throw new ArithmeticException();
        return g / k;
    }
    @Override
    public int prod() {
        return 0;
    }

}