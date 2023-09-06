package Test733;

public class Main {
    public static void main(String[] args) {
        //int[][] arr = Solution.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2);
        int[][] arr = Solution2.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}},1,1,2);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
