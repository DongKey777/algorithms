class Solution {
    static int answer = 0;
    public int solution(int n, int k) {
        String transN = Integer.toString(n,k);
        String temp = "";
        System.out.println(transN);
        for(char c : transN.toCharArray()) {
            if (c != '0') {
                temp += String.valueOf(c);
            }else {
                if (!temp.equals("") && isPrime(Integer.parseInt(temp))) {
                    answer ++;
                }
                temp = "";
            }
        }
        if (!temp.equals("") && isPrime(Long.parseLong(temp))) {
            answer ++;
        }
        return answer;
    }
    
    public boolean isPrime(long n) {
        if (n==1) return false;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0) return false; 
        }
        
        return true;
     }
}