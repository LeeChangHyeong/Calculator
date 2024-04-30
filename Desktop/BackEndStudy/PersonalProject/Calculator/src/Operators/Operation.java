package Operators;

import Exceptions.BadNumException;
import Exceptions.DivideToZeroException;

public interface Operation {
    double calculate(double firstNum, double secondNum) throws BadNumException, DivideToZeroException;
}
