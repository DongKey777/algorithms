import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner sj = new StringJoiner("\n");
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < T; i++) {
            int cnt = 0;
            Queue<Position> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] map = new int[M][N];
            boolean[][] visited = new boolean[M][N];

            for (int k = 0; k < K; k++) { // map 정보 입력
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int m = 0; m < M; m++) { // bfs
                for (int n = 0; n < N; n++) {

                    if (map[m][n] == 1 && !visited[m][n]) {
                        queue.add(new Position(m, n));
                        visited[m][n] = true;
                        cnt++;
                        while (!queue.isEmpty()) {
                            Position position = queue.poll();
                            int preM = position.getM();
                            int preN = position.getN();

                            for (int x = 0; x < 4; x++) {
                                int nM = preM + dx[x];
                                int nN = preN + dy[x];

                                if (nM < 0 || nM >= M || nN < 0 || nN >= N) {
                                    continue;
                                }

                                if (visited[nM][nN] || map[nM][nN] == 0) {
                                    continue;
                                }
                                queue.add(new Position(nM, nN));
                                visited[nM][nN] = true;
                            }
                        }
                    }
                }
            }

            sj.add(Integer.toString(cnt));
        }

        System.out.println(sj);
    }
}

class Position {
    int m;
    int n;

    Position(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
