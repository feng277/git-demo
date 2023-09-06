package Test733;
//自己仿着写的
public class Solution2 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] b = new boolean[image.length][image[0].length];
        dfs(image,b,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void dfs(int[][] image, boolean[][] b, int sr, int sc, int color, int changedColor){
        if (sc < image[0].length && sr < image.length && sc >= 0 && sr >= 0 && b[sr][sc] == false && image[sr][sc] == changedColor) {
            b[sr][sc] = true;
            image[sr][sc] = color;
            dfs(image,b,sr+1,sc,color,changedColor);
            dfs(image,b,sr,sc+1,color,changedColor);
            dfs(image,b,sr-1,sc,color,changedColor);
            dfs(image,b,sr,sc-1,color,changedColor);
        }
    }
}