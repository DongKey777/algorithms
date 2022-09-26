class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 0;
        int col = 0;
        for (int i=1; i<5000;i++){
            for (int j=i; j<5000; j++){
                if (((j * 2) + (i * 2 -4))==brown  && yellow == (j * i - brown)){
                    row = j;
                    col = i;
                    break;
                }
            }
        }
        return new int[]{row,col};
    }
}