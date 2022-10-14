import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        
        
        for(long i=left ; i<=right; i++){
            long row = (long) i / n;
            long column = (long)i % n;
            answer.add(Math.max((int)row+1,(int)column+1));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}