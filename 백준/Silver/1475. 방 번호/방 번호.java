import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String targetNum = input.replaceAll("9", "6");

        double[] numbers = new double[9];


        for (String num : targetNum.split("")) {
            numbers[Integer.parseInt(num)] += 1;
        }

        numbers[6] /= 2;

        double answer = 0;

        for (double num : numbers) {
            if (num > answer) {
                answer = num;
            }
        }
        System.out.println((int) Math.round(answer));
    }
}

