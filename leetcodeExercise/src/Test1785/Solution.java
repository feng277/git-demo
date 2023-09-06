package Test1785;

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0L;
        for (int num : nums) {
            sum += num;
        }
        if (sum > goal) {
            if ((sum - goal) % limit == 0){
                return (int)(sum - goal) / limit;
            }
            return (int)(sum - goal) / limit + 1;
        }else if (sum < goal) {
            if ((goal - sum) % limit == 0){
                return (int)(goal - sum) / limit;
            }
            return (int)(goal - sum) / limit + 1;
        }
        return 0;
    }
}