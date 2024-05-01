package Operators;

public class ModOperator implements Calculate {
    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum % secondNum;
    }
}
