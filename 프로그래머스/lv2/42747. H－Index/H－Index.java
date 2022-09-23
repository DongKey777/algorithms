import java.util.*; 

class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;

        Arrays.sort(citations);
        for (int i=1; i<=citations.length; i++) {
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i && i <= citations.length - j) {
                    hIndex = i;
                    System.out.println(hIndex);
                    break;
                }
            }
        }
        return hIndex;
    }
}