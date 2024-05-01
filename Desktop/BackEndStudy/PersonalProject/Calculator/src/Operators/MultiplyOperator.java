package Operators;

public class MultiplyOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }
}
