import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException, DivideToZeroException, BadOperationException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = Integer.parseInt(br.readLine());

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = Integer.parseInt(br.readLine());

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = br.readLine();

            double result = calculator.calculate(firstNum, secondNum, operator);

            System.out.println(result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (br.readLine().equals("exit")) {
                break;
            }
        }

    }
}