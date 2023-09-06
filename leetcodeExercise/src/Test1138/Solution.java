package Test1138;

class Solution {
    public static String alphabetBoardPath(String target) {
        char[][] board = {{'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'},{'p','q','r','s','t'},{'u','v','w','x','y'},{'z'}};
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder();
        int targetX = 0;
        int targetY = 0;
        //搜索目标字符在board中位置
        for (int i = 0; i < target.length(); i++) {
            lable:
            for (targetY = 0; targetY < board.length; targetY++) {
                for (targetX = 0; targetX < board[targetY].length; targetX++) {
                    if (target.charAt(i) == board[targetY][targetX])
                        break lable;
                }
            }

            //判断行进方向
            while (y != targetY || x != targetX) {
                if (targetY > y && y != 4) {
                    y++;
                    sb.append("D");
                }else if (targetY < y) {
                    y--;
                    sb.append("U");
                }
                if (targetX > x) {
                    x++;
                    sb.append("R");
                }else if (targetX < x){
                    x--;
                    sb.append("L");
                }
            }
            sb.append("!");
        }
        return sb.toString();
    }
}