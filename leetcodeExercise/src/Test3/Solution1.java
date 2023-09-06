package Test3;

class Solution1 {
    public static int lengthOfLongestSubstring(String s) {
        //位运算
        int leftIndex = 0;
        int rightIndex = 0;
        int lastSum = 0;
        int max = 0;
        while (rightIndex < s.length()) {
            int nowSum = lastSum ^ 1 << (s.charAt(rightIndex) - 97);
            if (nowSum > lastSum) {
                lastSum = nowSum;
                rightIndex++;
            }else {
                max = Math.max(max, rightIndex - leftIndex);
                leftIndex++;
                rightIndex = leftIndex;
                lastSum = 0;
            }
        }
        max = Math.max(max, rightIndex - leftIndex);
        return max;
    }
}