package Exceptions;

public class BadOperationException extends RuntimeException {
    public BadOperationException() {
        super("연산자를 잘못 입력하셨습니다. 똑바로 입력해 주세요.");
    }
}
