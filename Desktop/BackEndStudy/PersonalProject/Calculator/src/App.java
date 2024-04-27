import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws IOException, DivideToZeroException, BadOperationException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator(new LinkedList<>());

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = Integer.parseInt(br.readLine());

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = Integer.parseInt(br.readLine());

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = br.readLine();

            double result = calculator.calculate(firstNum, secondNum, operator);

            System.out.println(result);

            System.out.println();

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (br.readLine().equals("remove")) {
                calculator.removeFirstReseult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (br.readLine().equals("inquiry")) {
                System.out.println(calculator.getResults());
            }

            System.out.println();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (br.readLine().equals("exit")) {
                break;
            }
        }

    }
}