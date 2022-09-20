import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> slicedArr = new ArrayList<>();
        int[] answer = new int[commands.length];
        int index =0;
        for (int[] command : commands) {

            for (int i = command[0]-1; i <= command[1]-1; i++) {
                slicedArr.add(array[i]);
            }
            Collections.sort(slicedArr);
            answer[index] = slicedArr.get(command[2]-1);
            slicedArr.clear();
            index ++;
        }
        return answer;
    }
}