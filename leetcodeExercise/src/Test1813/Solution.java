package Test1813;

class Solution {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        //判断哪个句子较长
        String longSentance;
        String shortSentance;
        if (sentence1.length() >= sentence2.length()) {
            longSentance = sentence1;
            shortSentance = sentence2;
        }else {
            longSentance = sentence2;
            shortSentance = sentence1;
        }
        //两个双指针
        int leftIndexLong = 0;
        int rightIndexLong = longSentance.length() - 1;
        int leftIndexShort = 0;
        int rightIndexShort = shortSentance.length() - 1;
        int temp = 0;
        while(leftIndexShort < shortSentance.length()) {
            if (longSentance.charAt(leftIndexLong) == shortSentance.charAt(leftIndexShort)) {
                leftIndexLong ++;
                leftIndexShort ++;
                temp ++;
                if(longSentance.charAt(leftIndexLong) == ' ') {
                    temp = 0;
                }
            }else {
                leftIndexLong -= temp;
                leftIndexShort -= temp;
                break;
            }
        }
        while(rightIndexShort < leftIndexShort) {
            if (longSentance.charAt(rightIndexLong) != shortSentance.charAt(rightIndexShort)) {
                return false;
            }
            rightIndexLong--;
            rightIndexShort--;
        }
        return true;
    }
}