package Test463;

class Solution {
    public static int count = 0;
    public static int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    dfs (grid, j, i);
                    return count;
                }
            }
        }
        return 0;
    }
    public static void dfs(int[][] grid, int x, int y) {
        if (x >= 0 && x < grid[0].length && y >= 0 && y < grid.length && grid[y][x] == 1) {
//            if (y - 1 == 0 || y + 1 == grid.length) {
//                count++;
//            }
//            if(x - 1 == 0 || x + 1 == grid[0].length) {
//                count++;
//            }
            grid[y][x] = 2;
            dfs (grid,x+1,y);
            dfs (grid,x,y+1);
            dfs (grid,x-1,y);
            dfs (grid,x,y-1);
        }else {
            try {
                if (grid[y][x] == 0) {
                    count++;
                }
            }catch (ArrayIndexOutOfBoundsException e) {
                count++;
            }
        }
    }

    public static void bfs(){}
}
