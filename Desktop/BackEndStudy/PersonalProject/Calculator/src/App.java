import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> resultArr = new ArrayList<>();
        int index = 0;

        while (true) {
            Double result = 0.0; // 계산 결과 값

            System.out.println("첫 번째 숫자를 입력하세요: ");
            double firstInput = Double.parseDouble(br.readLine());

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operations = br.readLine();

            System.out.println("두 번째 숫자를 입력하세요: ");
            double secoundInput = Double.parseDouble(br.readLine());

            if (operations.equals("/") && secoundInput == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                switch (operations) {
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
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            String exit = br.readLine();

            if (exit.equals("exit")) {
                break;
            }
        }
    }
}