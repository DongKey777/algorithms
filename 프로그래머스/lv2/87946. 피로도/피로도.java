class Solution {
    private static int answer;
    private static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];

        DFS(dungeons, k, 0);

        return answer;
    }

    private void DFS(int[][] dungeons, int k, int depth){
        answer = Math.max(answer, depth);

        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i] = true;
                k-=dungeons[i][1];
                DFS(dungeons, k, depth+1);
                visited[i] = false;
                k+=dungeons[i][1];
            }
        }
    }
}
