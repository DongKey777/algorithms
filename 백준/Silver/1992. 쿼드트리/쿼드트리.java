import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] map;
    static int zero;
    static int one;
    static String st = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            String st = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = st.charAt(j);
            }
        }

        recursion(0,0,N);

        System.out.println(st);
    }

    public static void recursion(int row, int col, int size) {
        if (check(row, col, size)) {

            if (map[row][col] == '0') {
                st += "0";
            } else {
                st += "1";
            }
//            st += ")";
            return;
        }

        size /= 2;
        st += "(";
        recursion(row, col, size);
        recursion(row, col + size, size);

        recursion(row + size, col, size);
        recursion(row + size, col + size, size);
        st += ")";
    }


    public static boolean check(int row, int col, int size) {
        char num = map[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (map[i][j] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}