package Exceptions;

public class BadNumException extends Exception{
    public BadNumException() {
        super("숫자를 잘못 입력하셨습니다. 똑바로 입력해 주세요.");
    }
}
