import Exceptions.BadNumException;
import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;
import Operators.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;


public class ArithmeticCalculator extends Calculator {
    private double firstNum;
    private double secondNum;
    private OperatorType operatorType;
    private double result;
    private Map<OperatorType, Calculate> map;
    private AddOperator addOperator = new AddOperator();
    private DivideOperator divideOperator = new DivideOperator();
    private ModOperator modOperator = new ModOperator();
    private MultiplyOperator multiplyOperator = new MultiplyOperator();
    private SubtractOperator subtractOperator = new SubtractOperator();

    public ArithmeticCalculator(Map<OperatorType, Calculate> map) {
        this.map = map;
    }

    public void setValues(String firstNumStr, String secondNumStr, OperatorType operatorType) throws BadNumException {
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
        this.operatorType = operatorType;
    }

    @Override
    public Double calculate() throws BadOperationException, DivideToZeroException {
        Calculate someOperator = getOperatorType(operatorType);

        return someOperator.calculate(firstNum, secondNum);
    }

    private Calculate getOperatorType(OperatorType operatorType) {
        return map.get(operatorType);
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
