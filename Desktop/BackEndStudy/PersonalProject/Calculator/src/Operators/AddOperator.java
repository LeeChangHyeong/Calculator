package Operators;

public class AddOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
}
