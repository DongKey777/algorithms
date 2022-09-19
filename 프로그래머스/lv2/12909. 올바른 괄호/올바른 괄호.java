import java.util.*;


class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if (s.charAt(0) == ')') return false;
        
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c =='(') stack.push(c);
            else if (!stack.isEmpty() && c ==(')')) stack.pop();
        }
        return stack.isEmpty();
    }
}