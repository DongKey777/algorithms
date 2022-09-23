class Solution {
    boolean[] isVisited;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return answer;
    }

    public void dfs(int[][] dungeons, int count, int depth) {
        for (int i=0; i<dungeons.length; i++) {
            if (!isVisited[i] && dungeons[i][0] <= count) {
                isVisited[i] = true;
                dfs(dungeons, count-dungeons[i][1], depth+1);
                isVisited[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }
}