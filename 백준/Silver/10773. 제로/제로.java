import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(bf.readLine());
            if (number == 0) {
                numbers.pop();
            } else {
                numbers.push(number);
            }
        }

        int answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        System.out.println(answer);
    }
}
