import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt(); // 1000 이하
            int B;
            int A = P * W;
            if (W > R) {
                B = Q + (W - R) * S;
            } else {
                B = Q;
            }
            System.out.println("#" + test_case + " " + Math.min(A, B));
        }
    }
}