package Test542;

public class Main {
    public static void main(String[] args) {
        int[][] re = Solution.updateMatrix(new int[][]{{0,0,0},{0,1,0},{1,1,1}});
        for (int[] i : re) {
            for (int j : i) {
                System.out.printf("%d\t",j);
            }
            System.out.println();
        }
    }
}
