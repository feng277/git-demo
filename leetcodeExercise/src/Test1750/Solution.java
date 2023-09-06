package Test1750;

public class Solution {
    public static int minimumLength(String s) {
        char nowChar = s.charAt(0);
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                break;
            }
            for (;s.charAt(rightIndex) == nowChar && leftIndex < rightIndex; rightIndex--) {

            }
            for (;s.charAt(leftIndex) == nowChar && leftIndex < rightIndex; leftIndex++) {

            }
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                break;
            }
            if (s.charAt(leftIndex) == s.charAt(leftIndex) && rightIndex - leftIndex == 1) {
                return 0;
            }
            nowChar = s.charAt(leftIndex);
        }
        return rightIndex - leftIndex;
    }
}
