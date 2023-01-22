class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        int count = money / 5500 ;
        
        int r = money - 5500*count;
        
        return new int[]{count, r};
        
    }
}