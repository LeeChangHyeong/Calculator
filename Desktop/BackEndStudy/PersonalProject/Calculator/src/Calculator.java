import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public Queue<Double> queue = new LinkedList<>(); // 연산 결과를 저장하는 컬렉션 타입
    public Queue<Double> circleAreaQueue = new LinkedList<>(); // 원 넓이 저장하는 컬렉션

    // throws로 BadOperationException, DivideToZeroException의 예외 사항을 던질 수 있는지 알려줌
    public Double calculate(double firstNum, double secondNum, String operation) throws BadOperationException, DivideToZeroException {
        double result = 0.0;

        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                if (secondNum == 0) {
                    // 상황에 맞게 던지고 메서드 종료
                    throw new DivideToZeroException();
                }
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                // 상황에 맞게 던지고 메서드 종료
                throw new BadOperationException();
        }

        queue.add(result);

        return result;
    }

    // 저장된 값들을 return하는 메서드
    public Queue<Double> getResults() {
        return new LinkedList<>();
    }

    public void removeFirstReseult() {
    }


    // 원의 넓이를 구하는 메서드
    public double calculateCircleArea(double radius) {
        return radius * radius * 3.14;
    }

    // 원의 넓이 저장
    public void setCircleArea(double circleArea) {
    }


}