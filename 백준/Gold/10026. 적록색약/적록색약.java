import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner sj = new StringJoiner(" ");

        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        char[][] mapForGR = new char[N][N];
        for (int i = 0; i < N; i++) { // map 채우기
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);

                if (line.charAt(j) == 'R') {
                    mapForGR[i][j] = 'G';
                } else {
                    mapForGR[i][j] = line.charAt(j);
                }

            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        char color;
        int cnt = 0;

        int[] dm = {1, -1, 0, 0};
        int[] dn = {0, 0, 1, -1};

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'V') {
                    continue;
                }
                queue.add(new int[]{i, j});
                color = map[i][j];
                cnt++;

                while (!queue.isEmpty()) {
                    int[] position = queue.poll();
                    int m = position[0];
                    int n = position[1];

                    for (int k = 0; k < 4; k++) {
                        int nm = m + dm[k];
                        int nn = n + dn[k];

                        if (nm < 0 || nm >= N || nn < 0 || nn >= N) {
                            continue;
                        }
                        if (map[nm][nn] == 'V' || map[nm][nn] != color) {
                            continue;
                        }

                        map[nm][nn] = 'V';
                        queue.add(new int[]{nm, nn});
                    }
                }
            }
        }
        sj.add(String.valueOf(cnt));

        cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mapForGR[i][j] == 'V') {
                    continue;
                }
                queue.add(new int[]{i, j});
                color = mapForGR[i][j];
                cnt++;

                while (!queue.isEmpty()) {
                    int[] position = queue.poll();
                    int m = position[0];
                    int n = position[1];

                    for (int k = 0; k < 4; k++) {
                        int nm = m + dm[k];
                        int nn = n + dn[k];

                        if (nm < 0 || nm >= N || nn < 0 || nn >= N) {
                            continue;
                        }
                        if (mapForGR[nm][nn] == 'V' || mapForGR[nm][nn] != color) {
                            continue;
                        }

                        mapForGR[nm][nn] = 'V';
                        queue.add(new int[]{nm, nn});
                    }
                }
            }
        }

        sj.add(String.valueOf(cnt));
        System.out.println(sj);
    }
}