class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int roller = section[0];
        
        for (int wall : section) {
            if (roller + m <= wall) {
                roller = wall;
                answer++;
            }
        }
        
        return answer;
    }
}