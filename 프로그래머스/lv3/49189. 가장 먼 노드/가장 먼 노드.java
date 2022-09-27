import java.util.*;

class Solution {
    int answer = 0;
    public int solution(int n, int[][] edge){
        boolean[][] node = new boolean[n+1][n+1];
        for(int[] e : edge) {
            node[e[0]][e[1]] = true;
            node[e[1]][e[0]] = true;
        }

        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        visited[0] = true;

        bfs(node, 1,visited, dist);
        return answer ;
    }

    public void bfs(boolean[][] node, int start, boolean[] visited , int[] dist) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int n = queue.poll();

            for(int i=1; i<node.length; i++) {
                if (node[n][i] && !visited[i]) {
                    dist[i] = dist[n] + 1;
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        int max = 0;
        for (int d : dist) {
            if(max<d) {
                max = d;
                answer = 1;
            }else if(max==d){
                answer +=1;
            }
        }
    }}

