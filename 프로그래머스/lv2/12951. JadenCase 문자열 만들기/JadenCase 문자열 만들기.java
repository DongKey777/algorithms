import java.util.*;

class Solution {
    public String solution(String s) {
        char temp = ' ';
        String answer = "";
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (temp == ' ') {
                answer += String.valueOf(c).toUpperCase();
            }else{
                answer += String.valueOf(c);
            }
            temp = c;
        }
        return answer;
    }
}
    
        