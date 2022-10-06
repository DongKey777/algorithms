import java.util.*;

public class Solution {
    public int solution(int n) {
        int energy = 0;
        
        while(n!=0) {
            if (n%2==0) {
                n = n/2;
            }else{
                n = n-1;
                energy++;
            }
        }
        return energy;
    }
}