import Exceptions.BadNumException;

import java.util.Queue;

public class CircleCalculator extends Calculator {
    private Double radius;

    @Override
    public Double calculate() {
        return radius * radius * 3.14;
    }

    public void setRadius(String radius) throws BadNumException {
        try {
            this.radius = Double.parseDouble(radius);
        } catch (NumberFormatException e) {
            throw new BadNumException();
        }

    }

    @Override
    public void setResults() {
        circleAreaQueue.add(calculate());
    }

    @Override
    public Queue<Double> getResults() {
        return circleAreaQueue;
    }

    @Override
    public void removeFirstReseult() {
        circleAreaQueue.poll();
    }
}