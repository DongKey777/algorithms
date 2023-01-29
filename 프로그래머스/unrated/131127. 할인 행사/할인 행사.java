import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <= discount.length - 10; i++) {

            for (int k = 0; k < want.length; k++) {
                map.put(want[k], number[k]);
            }

            for (int j = i; j < i + 10; j++) {
                if (map.containsKey(discount[j])) {
                    if (map.get(discount[j]) == 1) {
                        map.remove(discount[j]);
                    } else {
                        map.put(discount[j], map.get(discount[j]) - 1);
                    }
                }
            }
            if (map.keySet().size() == 0) {
                answer++;
            }
        }

            if (discount.length == number.length) {
                if (discount[0].equals(want[0])) {
                    answer++;
                }
            }
        return answer;
    }
}