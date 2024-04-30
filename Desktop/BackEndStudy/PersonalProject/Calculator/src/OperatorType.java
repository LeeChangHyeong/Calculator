import Exceptions.BadOperationException;

public enum OperatorType {
    ADD("+"),
    DIVIDE("/"),
    MOD("%"),
    MULTIPLY("*"),
    SUBTRACT("-");

    private final String symbol;

    // id 느낌으로 지정
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    // 입력된 기호에 해당하는 OperatorType enum 상수를 반환하는 정적 메서드
    public static OperatorType getOperatorBySymbol(String symbol) throws BadOperationException {
        // OperatorType.values() -> 배열로 만들어줌
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.getSymbol().equals(symbol)) {
                return operatorType;
            }
        }
        throw new BadOperationException(); // 올바르지 않은 연산 기호가 입력된 경우 예외 처리
    }
}

