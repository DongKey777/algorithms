import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[][] map;
    public int solution(int n, int[][] wires) {

        map = new int[n+1][n+1];

        for(int[] i : wires) {
            map[i[0]][i[1]] = 1;
            map[i[1]][i[0]] = 1;
        }

        int min = Integer.MAX_VALUE;

        int a,b;
        for(int i=0; i<wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;

            min = Math.min(min, bfs(n, a));

            map[a][b] = 1;
            map[b][a] = 1;
        }
        return min;
    }


    public int bfs(int n, int start) {
        int[] visit = new int[n+1];
        int cnt = 1;

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int point = q.poll();
            visit[point] = 1;

            for(int i=1; i<=n; i++) {
                if(visit[i] == 1) continue;
                if(map[point][i] == 1) {

                    q.offer(i);
                    cnt++;
                }
            }
        }

        return Math.abs(n -2*cnt);
    }
}