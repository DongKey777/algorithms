import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Solution {
    public int solution(int k, int[] tangerine) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int weight : tangerine) {
            numbers.put(weight, numbers.getOrDefault(weight, 0) + 1);
        }

        List<Entry<Integer, Integer>> entryList = new ArrayList<>(numbers.entrySet());

        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());

        int result = 0;
        int target = k;
        for (Entry<Integer, Integer> number : entryList) {
            target -= number.getValue();
            result += 1;

            if (target <= 0) {
                break;
            }
        }
        return result;
    }
}