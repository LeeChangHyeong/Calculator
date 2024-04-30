import Exceptions.BadNumException;
import Exceptions.BadOperationException;
import Exceptions.DivideToZeroException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException, DivideToZeroException, BadOperationException, BadNumException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while (true) {
            System.out.println("사칙 연산을 진행하시겠습니까 원의 넓이를 구하시겠습니까? (1 입력시 사칙 연산, 아무 숫자 입력시 원의 넓이)");
            if (Integer.parseInt(br.readLine()) == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                String firstNum = br.readLine();

                System.out.print("두 번째 숫자를 입력하세요: ");
                String secondNum = br.readLine();

                System.out.print("사칙연산 기호를 입력하세요: ");
                String operator = br.readLine();

                arithmeticCalculator.setValues(firstNum, secondNum, operator);

                System.out.println(arithmeticCalculator.calculate());
                // 결과값 저장
                arithmeticCalculator.setResults();

                System.out.println();

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (br.readLine().equals("remove")) {
                    arithmeticCalculator.removeFirstReseult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (br.readLine().equals("inquiry")) {
                    System.out.println(arithmeticCalculator.getResults());
                }

                System.out.println();
            } else {
                System.out.print("원의 반지름을 입력하세요: ");
                String radius = br.readLine();
                circleCalculator.setRadius(radius);
                System.out.println();
                // 원의 넓이 구하기
                double circleArea = circleCalculator.calculate();

                System.out.println("원의 넓이: " + circleArea);
                // 결과값 저장
                circleCalculator.setResults();

                System.out.println("저장된 원의 넓이들: " + circleCalculator.getResults());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (br.readLine().equals("exit")) {
                break;
            }
        }

    }
}