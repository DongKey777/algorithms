import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();

            if (U < X) {
                System.out.println("#" + test_case + " " + -1);
            } else if (X < L) {
                System.out.println("#" + test_case + " " + (L - X));
            } else {
                System.out.println("#" + test_case + " " + 0);
            }
        }
    }
}