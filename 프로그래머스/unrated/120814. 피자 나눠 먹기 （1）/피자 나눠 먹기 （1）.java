class Solution {
    public int solution(int n) {
        int answer = 0;
        //피자는 7조각으로 고정.
        //7로 나눈 몫, 나머지 구하기
        int a = n/7;
        int b = n%7;
        
        if( b == 0) {
            answer = a * 1;
        } else if (b != 0) {
            answer = a *1 + 1;
        }
        return answer;
    }
}