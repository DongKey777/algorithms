import java.util.Scanner;

public class Main {

    static int[] d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        d = new int[N + 1];

        d[1] = 0;
        for (int i = 2; i <= N; i++) {
            d[i] = d[i - 1] + 1;
            
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
        }
        System.out.println(d[N]);
    }
}