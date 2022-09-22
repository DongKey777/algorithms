import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        String[] str = new String[numbers.length];

        for (int i=0; i<numbers.length; i++){
            str[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        for (String s : str) {
            sb.append(s);
        }
        return (sb.charAt(0) == '0') ? "0" : sb.toString();
    }
}