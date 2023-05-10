import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        int limit = queue1.length * 2;
        long s1 = 0;
        long s2 = 0;
        long sum;
        
        for(int tmp : queue1) {
            q1.add(tmp);
            s1 += tmp;
        }
        
        for(int tmp : queue2) {
            q2.add(tmp);
            s2 += tmp;
        }

        if ((s1 + s2) % 2 != 0) {
            return -1;
        }
        sum = (s1 + s2) / 2;

        int p1 = 0;
        int p2 = 0;
        while (p1 <= limit && p2 <= limit) {
            if (s1 == sum) {
                return p1 + p2;
            }
            if (s1 > sum) {
                s1 -= q1.peek();
                s2 += q1.peek();
                q2.add(q1.poll());
                p1++;
            } else {
                s2 -= q2.peek();
                s1 += q2.peek();
                q1.add(q2.poll());
                p2++;
            }
        }
        return -1;
    }
}



