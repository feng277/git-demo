package Test1764;

class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int preLeftIndex = 0;
        int leftIndex = 0;
        int i = 0;
        int j = 0;
        while (i < groups.length) {
            if (nums.length - leftIndex < groups[i].length) {
                return false;
            }
            while (leftIndex < nums.length) {
                if (nums.length - leftIndex < groups[i].length) {
                    return false;
                }
                for (j = 0; j < groups[i].length; j++) {
                    if (groups[i][j] != nums[leftIndex]) {
                        leftIndex = preLeftIndex + 1;
                        break;
                    }
                    leftIndex++;
                }
                preLeftIndex = leftIndex;

                if (j == groups[i].length) {
                    i++;
                    break;
                }
            }
        }
        return true;
    }
}
