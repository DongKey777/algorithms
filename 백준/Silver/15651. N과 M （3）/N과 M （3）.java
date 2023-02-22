import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static boolean[] visited;
    static int N;
    static int M;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M + 1];
        visited = new boolean[N + 1];
        sb = new StringBuilder();

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int index) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            arr[index] = i;
            dfs(index + 1);
            visited[i] = false;
        }
    }
}
