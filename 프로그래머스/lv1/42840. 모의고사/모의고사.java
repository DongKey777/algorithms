import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(2,1,2,3,2,4,2,5));
        ArrayList<Integer> num3 = new ArrayList<>(Arrays.asList(3,3,1,1,2,2,4,4,5,5));
        
        int scoreNum1 = 0;
        int scoreNum2 = 0;
        int scoreNum3 = 0;
        
        int index = 0 ;
        
        for (int i : answers) {
            if (i == num1.get(index % num1.size())) {
                scoreNum1 += 1;
            }
            if (i == num2.get(index % num2.size())) {
                scoreNum2 += 1;
            }
            if (i == num3.get(index % num3.size())) {
                scoreNum3 += 1;
            }
            index += 1;
        }
        
        
        int max = Collections.max(Arrays.asList(scoreNum1, scoreNum2, scoreNum3));
        
        List<Integer> loop = new ArrayList<>(Arrays.asList(scoreNum1, scoreNum2, scoreNum3));
        int cnt = 1;
        for (Integer i : loop) {
            if (i == max) {
                answer.add(cnt);
            }
            cnt ++;
        }
        int[] result = answer.stream()
                        .mapToInt(Integer :: intValue)
                        .toArray();
        return result;
        
        
        
    }
}