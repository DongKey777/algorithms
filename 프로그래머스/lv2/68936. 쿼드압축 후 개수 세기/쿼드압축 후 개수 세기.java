class Solution {
    static int oneCnt = 0;
    static int zeroCnt = 0;

    public int[] solution(int[][] arr) {
        dfs(0,0,arr[0].length,arr);

        return new int[] {zeroCnt, oneCnt};
    }

    public void dfs(int row, int col, int length, int[][] arr) {

        if (checkSame(row, col, length, arr)) {
            if (arr[row][col] == 1) {
                oneCnt++;
            } else {
                zeroCnt++;
            }
        } else {
            dfs(row, col, length / 2, arr);
            dfs(row + length / 2, col, length / 2, arr);
            dfs(row, col + length / 2, length / 2, arr);
            dfs(row + length / 2, col + length / 2, length / 2, arr);
        }
    }


    public boolean checkSame(int row, int col, int length, int[][] arr) {
        int k = arr[row][col];

        for (int i = row; i < row + length; i++) {
            for (int j = col; j < col + length; j++) {
                if (arr[i][j] != k) {
                    return false;
                }
            }
        }
        return true;
    }
}