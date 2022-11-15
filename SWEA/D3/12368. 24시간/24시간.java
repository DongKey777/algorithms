import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = A+B;
            while(C>=24) {
                C -= 24;
            }
            System.out.println("#" + test_case + " " + C);
        }
    }
}