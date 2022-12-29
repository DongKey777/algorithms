import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        int[] map = new int[2000001];

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int x = scanner.nextInt();
        int answer = 0;
        for (int number : numbers) {
            if (x > number && map[x - number] != 0) {
                answer += 1;
            }
            map[number] += 1;
        }

        System.out.println(answer);
    }
}

