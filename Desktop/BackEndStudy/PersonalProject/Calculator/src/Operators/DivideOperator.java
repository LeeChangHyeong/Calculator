package Operators;

public class DivideOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
}
