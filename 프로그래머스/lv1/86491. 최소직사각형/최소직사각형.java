class Solution {
    public int solution(int[][] sizes) {
        int maxWidth =0;
        int maxLength =0;
        int width;
        int length;

        for (int[] size : sizes) {

            width = Math.min(size[0], size[1]);
            length = Math.max(size[0], size[1]);

            maxLength = Math.max(maxLength, length);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxLength * maxWidth;
    }
}