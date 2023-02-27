import java.util.Scanner;

public class Main {

    static int[] d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        d = new int[11];

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(d[scanner.nextInt()]);
        }
        
    }
}