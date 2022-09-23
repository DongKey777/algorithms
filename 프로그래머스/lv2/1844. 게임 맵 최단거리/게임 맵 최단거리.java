import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[][] isVisited = new int[maps.length][maps[0].length];
        Queue<Position> queue = new LinkedList<>();
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        queue.add(new Position(0,0));
        isVisited[0][0]= 1;

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for(int i=0; i<4; i++) {
                int nextX = position.x + dx[i];
                int nextY = position.y + dy[i];

                if(nextY < 0 || nextX < 0 || nextY == maps.length || nextX == maps[0].length) {
                    continue;
                }
                if(maps[nextY][nextX] == 0) {
                    continue;
                }
                isVisited[nextY][nextX] = isVisited[position.y][position.x] + 1;
                maps[nextY][nextX] = 0;
                queue.add(new Position(nextY, nextX));
            }
        }
        int answer = isVisited[maps.length-1][maps[0].length-1];
        return (answer ==0) ? -1 : answer;
    }
}

class Position {
    int x ;
    int y ;

    Position(int y, int x) {
        this.y = y;
        this.x = x;
    }
}