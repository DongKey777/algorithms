import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Queue<Position> queue;
        StringTokenizer st;
        StringJoiner sj = new StringJoiner("\n");

        int[] dm = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] dn = {2, 1, -1, -2, -2, -1, 1, 2};

        for (int i = 0; i < T; i++) {
            int L = Integer.parseInt(br.readLine());
            int[][] map = new int[L][L];

            queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int count = 0;

            Position start = new Position(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            st = new StringTokenizer(br.readLine());
            Position end = new Position(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            queue.add(start);

            while (!queue.isEmpty()) {
                Position position = queue.poll();

                if (position.equals(end)) {
                    count = map[position.getM()][position.getN()];
                    break;
                }

                int m = position.getM();
                int n = position.getN();

                for (int k = 0; k < 8; k++) {
                    int nm = m + dm[k];
                    int nn = n + dn[k];

                    if (nm < 0 || nm >= L || nn < 0 || nn >= L) {
                        continue;
                    }

                    if (map[nm][nn] != 0) {
                        continue;
                    }
                    map[nm][nn] = map[m][n] + 1;
                    queue.add(new Position(nm, nn));
                }
            }
            queue.clear();
            sj.add(String.valueOf(count));
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

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return m == position.m && n == position.n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m, n);
    }
}


