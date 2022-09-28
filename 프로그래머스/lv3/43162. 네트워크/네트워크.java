class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

        for(int i=0; i<n; i++) {
            if (!visited[i]) {
                answer ++;
                dfs(computers, visited, i);
            }
        }

        return answer;
    }

    public void dfs(int[][] computers, boolean[] visited, int i){
        visited[i] = true;
        for(int j=0; j< computers.length; j++) {
            if (!visited[j] && computers[i][j] ==1) {
                dfs(computers, visited, j);
            }
        }
    }
}