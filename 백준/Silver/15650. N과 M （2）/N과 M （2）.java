import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int N;
    static int M;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        numbers = new int[M + 1];

        dfs(0, 1);
    }

    public static void dfs(int depth, int at) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(numbers[i] + " ");
//                sb.append(numbers[i]).append(" ");
            }
            System.out.println();
//            sb.append("\n");
            return;
        }

        for (int i = at; i <= N; i++) {
            if (!visited[i]) {
                numbers[depth] = i;
                visited[i] = true;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }

    }
}
