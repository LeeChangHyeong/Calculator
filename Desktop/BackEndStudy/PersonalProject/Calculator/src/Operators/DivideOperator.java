package Operators;

import Exceptions.DivideToZeroException;

public class DivideOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) throws DivideToZeroException {
        if (secondNum == 0) {
            throw new DivideToZeroException();
        }
        return firstNum / secondNum;
    }
}
