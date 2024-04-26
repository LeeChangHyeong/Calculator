package Exceptions;

public class DivideToZeroException extends Exception {
    public DivideToZeroException() {
        super("0으로 나누셨습니다. 제대로 입력해주세요.");
    }
}
