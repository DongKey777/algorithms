import java.util.*;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        
        int[] intNumbers = new int[numbers.length];
        
        for (int i=0; i<numbers.length; i++){
            if (numbers[i].charAt(0)==('-')){
                intNumbers[i] = (-1) * Integer.parseInt(numbers[i].substring(1));
            }else intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(intNumbers);
        String answer = Integer.toString(intNumbers[0]) + " " + Integer.toString(intNumbers[intNumbers.length-1]);
        
        return answer;
    }
}
    
        
