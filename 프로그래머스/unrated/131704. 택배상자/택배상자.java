import java.util.*;

class Solution {
    public int solution(int[] order) {
        
        Stack<Integer> q = new Stack<>();
        
        
        int mainContainer = 1;
        int answer = 0;
        for(int e: order) {
            while(mainContainer <= order.length) {
                if(mainContainer == e) {
                    break;
                }else if(!q.isEmpty() && q.peek() == e) {
                    break;
                }else{
                    q.push(mainContainer);
                    mainContainer++;
                } 
            }
            
            
            if(mainContainer == e) {
                mainContainer++;
                answer++;
            }else if(!q.isEmpty() && q.peek() == e) {
                q.pop();
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}
