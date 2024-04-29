package Operators;

public class SubtractOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
}
