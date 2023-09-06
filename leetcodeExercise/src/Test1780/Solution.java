package Test1780;

class Solution {
    public boolean checkPowersOfThree(int n) {
        int jinzhi3;
        int maxIndex = 0;
        for(; Math.pow(3,maxIndex + 1) < n; maxIndex ++) {

        }
        for(; maxIndex > 0; maxIndex--) {
            int devideNum = (int)Math.pow(3,maxIndex);
            if (n / devideNum == 2) {
                return false;
            }else if (n / devideNum == 1) {
                n -= Math.pow(3,maxIndex);
            }
        }
        return true;
    }
}