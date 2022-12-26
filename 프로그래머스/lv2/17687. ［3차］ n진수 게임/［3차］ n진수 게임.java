class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<t*m; i++) {
            answer.append(Integer.toString(i, n));
        }

        String[] str = answer.toString().split("");

        StringBuilder result = new StringBuilder();

        for(int i=1; i<=str.length; i++) {
            if (m == p) {
                if (i % m != 0) continue;
            }else {
                if (i % m != p) continue;
            }

            result.append(str[i-1]);
            if (result.length() == t) break;
        }
        return result.toString().toUpperCase();
    }

}