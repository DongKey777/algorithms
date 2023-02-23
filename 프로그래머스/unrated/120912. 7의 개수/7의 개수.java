class Solution {
    public int solution(int[] array) {
        int count = 0;
        for(int i: array) {
            String[] str = String.valueOf(i).split("");
            
            for(String s : str) {
                if(s.equals("7")) {
                    count++;
                }
            }
        }
        return count;
    }
}