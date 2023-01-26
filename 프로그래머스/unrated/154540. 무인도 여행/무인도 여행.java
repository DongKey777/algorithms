import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(String[] maps) {

        char[][] map = new char[maps.length][maps[0].length()];

        for (int m = 0; m < maps.length; m++) {
            for (int n = 0; n < maps[0].length(); n++) {
                map[m][n] = maps[m].charAt(n);
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int days = 0;
        List<Integer> answer = new ArrayList<>();
        for (int m = 0; m < maps.length; m++) {
            for (int n = 0; n < maps[0].length(); n++) {
                if (map[m][n] == 'X') {
                    continue;
                }
                Queue<int[]> queue = new LinkedList<>();
                days += map[m][n] - '0';
                map[m][n] = 'X';
                queue.add(new int[]{m, n});

                while (!queue.isEmpty()) {
                    int[] position = queue.poll();
                    int nowM = position[0];
                    int nowN = position[1];
                    for (int i = 0; i < 4; i++) {
                        int nm = nowM + dx[i];
                        int nn = nowN + dy[i];

                        if (nm < 0 || nm >= maps.length || nn < 0 || nn >= maps[0].length()) {
                            continue;
                        }
                        if (map[nm][nn] == 'X') {
                            continue;
                        }
                        days += (map[nm][nn] - '0');

                        map[nm][nn] = 'X';
                        queue.add(new int[]{nm, nn});
                    }
                }
                if (days != 0) {
                    answer.add(days);
                    days = 0;
                }
            }
        }
        if (answer.isEmpty()) {
            return new int[]{-1};
        } else {
            answer.sort(Comparator.naturalOrder());
            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}