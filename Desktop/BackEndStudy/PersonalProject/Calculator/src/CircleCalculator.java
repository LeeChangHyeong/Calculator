import java.util.Queue;

public class CircleCalculator extends Calculator{
    @Override
    public Queue<Double> getResults() {
        return circleAreaQueue;
    }

    @Override
    public double calculateCircleArea(double radius) {
        return super.calculateCircleArea(radius);
    }

    @Override
    public void setCircleArea(double circleArea) {
        circleAreaQueue.add(circleArea);
    }
}
