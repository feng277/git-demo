package Test733;

class Solution1 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] booleans = new boolean[m][n];
        dfs(image,booleans,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void dfs(int[][] image,boolean[][] booleans,int i,int j,int color,int val){
        if (i >= 0 && j >= 0 && i < image.length && j< image[0].length&& !booleans[i][j] &&image[i][j] == val) {
            booleans[i][j] = true;
            image[i][j] = color;
            dfs(image,booleans,i+1,j,color,val);
            dfs(image,booleans,i-1,j,color,val);
            dfs(image,booleans,i,j+1,color,val);
            dfs(image,booleans,i,j-1,color,val);
        }
    }
}

        //作者：Dawn
        //链接：https://leetcode.cn/problems/flood-fill/solutions/1889501/java-dfs-very-good-by-dawn-c6-h0wq/
        //来源：力扣（LeetCode）
        //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
