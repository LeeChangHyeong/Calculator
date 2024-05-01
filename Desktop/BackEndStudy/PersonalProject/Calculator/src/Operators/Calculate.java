package Operators;

import Exceptions.DivideToZeroException;

public interface Calculate {
    public abstract double calculate(double firstNum, double secondNum) throws DivideToZeroException;
}
