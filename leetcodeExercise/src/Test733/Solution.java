package Test733;

class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        image[sr][sc] = color;
        //上
        if (sr != 0 && image[sr - 1][sc] == image[sr][sc]) {
            return floodFill(image, sr - 1, sc, color);
        }
        //下
        else if (sr != image.length - 1 && image[sr + 1][sc] == image[sr][sc]) {
            return floodFill(image, sr + 1, sc, color);
        }
        //左
        if (sc != 0 && image[sr][sc - 1] == image[sr][sc]) {
            return floodFill(image, sr, sc - 1, color);
        }
        //右
        else if (sc != image[sr].length - 1 && image[sr][sc + 1] == image[sr][sc]) {
            return floodFill(image, sr, sc + 1, color);
        }
        return image;
    }
}