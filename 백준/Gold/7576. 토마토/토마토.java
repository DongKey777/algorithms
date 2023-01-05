import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        boolean success = true;
        boolean initialSuccess = true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }

                if (map[i][j] == 0) {
                    initialSuccess = false;
                }
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int x = position[0];
            int y = position[1];

            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if (map[nx][ny] == -1) {
                    continue;
                }
                if (map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                queue.add(new int[]{nx, ny});
                map[nx][ny] = map[x][y] + 1;
                visited[nx][ny] = true;
            }
        }
        int max = -2;

        for (int i = 0; i < N; i++) {
            if (!success) {
                break;
            }

            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    success = false;
                }

                if (max < map[i][j]) {
                    max = map[i][j];
                }
            }
        }
        if (initialSuccess) {
            System.out.println("0");
        } else if (success) {
            System.out.println(max-1);
        } else {
            System.out.println("-1");
        }
    }
}
