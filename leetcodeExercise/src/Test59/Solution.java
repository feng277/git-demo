package Test59;

class Solution {
    public static int[][] generateMatrix(int n) {
        int count = 1;
        int[][] arr = new int[n][n];
        int maxCount = n * n;
        int start = 0; //循环开始的点(start, start)
        int loop = n - 1;
        int i;
        while(start < n / 2) {
            for (i = start; i < loop; i++) {
                 arr[start][i]= count;
                count++;
            }
            for (i = start; i < loop; i++) {
                arr[i][loop] = count;
                count++;
            }
            for (i = loop; i > start; i--) {
                arr[loop][i] = count;
                count++;
            }
            for (i = loop; i > start; i--) {
                arr[i][start] = count;
                count++;
            }

            start++;
            loop--;
        }
        // if (n % 2 == 1) {
        //     arr[start][start] = count;
        // }
        return arr;
    }
}