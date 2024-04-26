import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Double> resultArr = new LinkedList<>();
        int index = 0;

        while (true) {
            Double result = 0.0; // 계산 결과 값

            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstInput = Double.parseDouble(br.readLine()); // 첫 번째 숫자 입력

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operations = br.readLine(); // 기호 입력
            if(operations != "+" || operations != "-" || operations != "*"|| operations != "/" ) {
                System.out.println("올바른 연산기호를 입력해 주세요");
                break;
            }

            System.out.println("두 번째 숫자를 입력하세요: ");
            double secoundInput = Double.parseDouble(br.readLine()); // 첫 번째 숫자 입력

            // 나눗셈 오류 걸러내기
            if (operations.equals("/") && secoundInput == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                switch (operations) { // 연산자 별로 연산 실행
                    case "+":
                        result = firstInput + secoundInput;
                        break;
                    case "-":
                        result = firstInput - secoundInput;
                        break;
                    case "/":
                        result = firstInput / secoundInput;
                        break;
                    case "*":
                        result = firstInput * secoundInput;
                        break;
                }
                System.out.println("결과: " + result);
                resultArr.add(result);
            }
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) ");
            String removeResult = br.readLine();

            if (removeResult.equals("remove")) {
                resultArr.poll();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) ");
            String printAll = br.readLine();

            if(printAll.equals("inquiry")) {
                resultArr.forEach(f -> System.out.println(f));
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = br.readLine();

            if (exit.equals("exit")) {
                break;
            }
        }
    }
}