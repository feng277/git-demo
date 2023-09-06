package Test2042;

public class Solution {
    public static boolean areNumbersAscending(String s) {
        String strNum = "";
        int num;
        int lastNum = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 57 && s.charAt(i) >= 48) {
                strNum += s.charAt(i);
                if ( i == s.length() - 1) {
                    num = Integer.valueOf(strNum);
                    if (num <= lastNum) {
                        return false;
                    }
                    lastNum = num;
                    strNum = "";
                }
            }else if (s.charAt(i) == ' '&& strNum != "") {
                num = Integer.valueOf(strNum);
                if (num <= lastNum) {
                    return false;
                }
                lastNum = num;
                strNum = "";
            }
        }
        return true;
    }
}
