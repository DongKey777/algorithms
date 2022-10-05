class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntOneN = toBinary(n);
                             
        for(int i = n+1; i<1000000; i++) {
            int cntOneI = toBinary(i);
            if (cntOneN == cntOneI) {
                answer=i;
                return answer;
            }
        }
        
        return answer; 
    }
    
    public int toBinary(int n) {
        int cntOne = 0;
        while(n != 0) {
            cntOne += n % 2;
            n = n / 2;
        }
        
        return cntOne;
    }
}