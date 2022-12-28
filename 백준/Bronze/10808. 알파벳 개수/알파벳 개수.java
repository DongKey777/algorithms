import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int cnt;

        for (char alpa = 'a'; alpa <= 'z'; alpa++) {

            cnt = 0;
            for (char c : chars) {
                if (c == alpa) {
                    cnt++;
                }
            }
            stringBuilder.append(cnt).append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
