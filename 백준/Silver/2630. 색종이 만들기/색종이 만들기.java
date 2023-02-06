import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int zero;
    static int one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(zero);
        System.out.println(one);

    }


    public static boolean check(int row, int col, int size) {
        int color = map[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (map[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void partition(int row, int col, int size) {
        if (check(row, col, size)) {
            if (map[row][col] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        size = size / 2;

        partition(row, col, size);
        partition(row, col + size, size);

        partition(row + size, col, size);
        partition(row + size, col + size, size);
    }


}