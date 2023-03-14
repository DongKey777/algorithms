class Solution {
    public int[] solution(int[] numbers) {
        
        int[] doubledNumbers = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            doubledNumbers[i] = 2 * numbers[i];
        }
        
        return doubledNumbers;
    }
}