import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
4 4
####
#JF#
#..#
#..#
ans: 3

3 3
###
#J.
#.F
ans: IMPOSSIBLE

4 6
######
......
#.J###
#F####
ans: 5

5 4
####
#...
#.##
#.J#
####
ans: 6

7 7
#######
#J#####
#.....#
#.#.#.#
#.#.#.#
F.#.#.#
##F.#.#
ans: 10

7 7
#######
#J###F#
#.....#
#.#.#.#
#.#.#.#
F.#.#.#
##F.#.#
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Position> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];
        int[][] distance = new int[R][C]; // 불이 붙었으면 -1 이동 가능하면 go
        boolean[][] visited = new boolean[R][C];
        boolean[][] fireVis = new boolean[R][C];
        for (int i = 0; i < R; i++) {  // 초기 맵 정보 저장
            String numbers = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = numbers.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) { // 초기 지훈 위치 큐에 저장
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'J') {
                    queue.add(new Position("J", i, j));
                }
            }
        }

        for (int i = 0; i < R; i++) { // 초기 불 위치 큐에 저장
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'F') {
                    queue.add(new Position("F", i, j));
                }
            }
        }

        int[] dR = {1, -1, 0, 0};
        int[] dC = {0, 0, 1, -1};

        boolean success = false;
        int max = Integer.MAX_VALUE;

        Position jihunPosition = queue.peek();
        int x = jihunPosition.getR();
        int y = jihunPosition.getC();
        if (x == 0 || x == R - 1 || y == 0 || y == C - 1) {
//            System.out.println(x+"ADA"+y);
            System.out.println(1);
            return;
        } // 예외케이스 지훈이가 바로 탈출 가능

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            String kind = position.getKind();
            int jR = position.getR();
            int jC = position.getC();
            visited[jR][jC] = true;

//            System.out.println("kind:" + kind + " x: " +jR+" y:"+jC );
//            System.out.println(distance[jR][jC]);
            if (kind.equals("J") && !fireVis[jR][jC]) {
                if (jR == 0 || jR == R - 1 || jC == 0 || jC == C - 1) {
                    success = true;
                    if(max > distance[jR][jC]) {
                        max = distance[jR][jC];
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                int nR = jR + dR[i];
                int nC = jC + dC[i];

                boolean b = nR < 0 || nR >= R || nC < 0 || nC >= C;
                if (kind.equals("J")) {
                    if (b) {
                        continue;
                    }
                    if (map[nR][nC] == '#' || map[nR][nC] == 'F' || visited[nR][nC] || fireVis[nR][nC]) {
                        continue;
                    }

//                    if (nR == 0 || nR == R - 1 || nC == 0 || nC == C - 1) {
////                        System.out.println("nR : " + nR + " nC : " + nC);
////                        System.out.println("end");
//                        success = true;
//
//                        distance[nR][nC] = distance[jR][jC] + 1;
//                        if (max > distance[nR][nC]) {
//                            max = distance[nR][nC];
//                        }
//                    }
                    distance[nR][nC] = distance[jR][jC] + 1;
                    queue.add(new Position("J", nR, nC));
                    visited[nR][nC] = true;
                }

                if (kind.equals("F")) {
                    if (b) {
                        continue;
                    }
                    if (map[nR][nC] == '#' || fireVis[nR][nC]) {
                        continue;
                    }
                    map[nR][nC] = 'F';
                    queue.add(new Position("F", nR, nC));
                    fireVis[nR][nC] = true;
                }
            }
        }

        if (success) {
            System.out.println(max + 1);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}

class Position {
    String kind;
    int R;
    int C;

    Position(String kind, int R, int C) {
        this.kind = kind;
        this.R = R;
        this.C = C;
    }

    public String getKind() {
        return kind;
    }

    public int getC() {
        return C;
    }

    public int getR() {
        return R;
    }
}