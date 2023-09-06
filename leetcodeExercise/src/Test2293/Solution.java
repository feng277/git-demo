package Test2293;

class Solution {
    public static int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] arr = new int[nums.length / 2];
        int temp = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if ((i / 2) % 2 == 0) { //min
                arr[temp] = Math.min(nums[i],nums[i+1]);
                temp++;
            }else { //max
                arr[temp] = Math.max(nums[i],nums[i+1]);
                temp++;
            }
        }
        return minMaxGame(arr);
    }
}
