import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    @Override
    public Double calculate(double firstNum, double secondNum, String operation) throws BadOperationException, DivideToZeroException {
        return super.calculate(firstNum, secondNum, operation);
    }

    @Override
    public Queue<Double> getResults() {
        return queue;
    }

    @Override
    public void removeFirstReseult() {
        queue.poll();
    }
}
