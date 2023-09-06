package Test1769;

public class Solution1 {
    public int[] minOperations(String boxes) {
        int[] left = new int[boxes.length()];
        int[] right = new int[boxes.length()];

        left[0] = 0;
        int ones = boxes.charAt(0) - '0';
        for (int i = 1; i < boxes.length(); i++) {
            left[i] = left[i - 1] + ones;
            ones += boxes.charAt(i) - '0';
        }

        right[boxes.length() - 1] = 0;
        ones = boxes.charAt(boxes.length() - 1) - '0';
        for (int i = boxes.length() - 2; i >= 0; i--) {
            right[i] = right[i + 1] + ones;
            ones += boxes.charAt(i) - '0';
        }

        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}
