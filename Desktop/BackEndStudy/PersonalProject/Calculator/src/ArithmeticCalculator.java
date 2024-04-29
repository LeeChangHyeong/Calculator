import Exceptions.BadNumException;
import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;
import Operators.AddOperator;
import Operators.DivideOperator;
import Operators.MultiplyOperator;
import Operators.SubtractOperator;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator {
    private double firstNum;
    private double secondNum;
    private String operator;
    private double result;
    private AddOperator addOperator = new AddOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private DivideOperator divideOperator = new DivideOperator();

    public void setValues(String firstNumStr, String secondNumStr, String operator) throws BadNumException {
        try {
            this.firstNum = Double.parseDouble(firstNumStr);
        } catch (NumberFormatException e) {
            throw new BadNumException();
        }

        try {
            this.secondNum = Double.parseDouble(secondNumStr);
        } catch (NumberFormatException e) {
            throw new BadNumException();
        }
        this.operator = operator;
    }

    @Override
    public Double calculate() throws BadOperationException, DivideToZeroException {
        switch (operator) {
            case "+":
                result = addOperator.operate(firstNum, secondNum);
                break;
            case "-":
                result = subtractOperator.operate(firstNum, secondNum);
                break;
            case "/":
                if (secondNum == 0) {
                    // 상황에 맞게 던지고 메서드 종료
                    throw new DivideToZeroException();
                }
                result = divideOperator.operate(firstNum, secondNum);
                break;
            case "*":
                result = multiplyOperator.operate(firstNum, secondNum);;
                break;
            default:
                // 상황에 맞게 던지고 메서드 종료
                throw new BadOperationException();
        }

        return result;
    }

    @Override
    public Queue<Double> getResults() {
        return queue;
    }

    @Override
    public void setResults() {
        queue.add(result);
    }

    @Override
    public void removeFirstReseult() {
        queue.poll();
    }
}
