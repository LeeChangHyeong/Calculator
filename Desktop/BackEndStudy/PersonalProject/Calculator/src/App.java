import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫 번째 숫자를 입력하세요: ");
        double firstInput = Double.parseDouble(br.readLine());

        System.out.println("두 번째 숫자를 입력하세요: ");
        double secoundInput = Double.parseDouble(br.readLine());
    }
}