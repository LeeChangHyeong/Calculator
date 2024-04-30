import Exceptions.BadNumException;
import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    public Queue<Double> queue  = new LinkedList<>(); // 연산 결과를 저장하는 컬렉션 타입
    public Queue<Double> circleAreaQueue = new LinkedList<>(); // 원 넓이 저장하는 컬렉션
    public abstract Double calculate() throws BadOperationException, DivideToZeroException, BadNumException;
    public abstract Queue<Double> getResults();
    public abstract void setResults();
    public abstract void removeFirstReseult();
}