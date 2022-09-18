import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int time = 1;
        Queue<Integer> pricesQueue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int price : prices){
            pricesQueue.add(price);
        }  
        while (!pricesQueue.isEmpty()) {
            int nowPrice = pricesQueue.poll();
            for (int price : pricesQueue) {
                if (nowPrice > price){
                    answer.add(time);
                    time = 1;
                    break;
                }else time ++;
            }
            if (time != 1) {
                answer.add(time-1);
            }
            time = 1;
        }
        answer.add(0);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}