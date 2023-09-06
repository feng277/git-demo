package Test3;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        char[] arr = new char[0];
        int maxCount = 0;
        for (; end != s.length(); end++) {
            if (!isEsist(arr,s.charAt(end))) {
                addChar(arr,s.charAt(end));
                continue;
            }else {
                if (end - start > maxCount) {
                    maxCount = end - start;
                }
                start = end;
            }
        }
        return maxCount;
    }
    public static boolean isEsist(char[] arr, char ch) {
        for (char c : arr) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
    public static char[] addChar(char[] arr, char ch) {
        char[] charr = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            charr[i] = arr[i];
        }
        charr[arr.length] = ch;
        return charr;
    }
}