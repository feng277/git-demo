package Test2309;

import java.util.ArrayList;
class Solution {
    public String greatestLetter(String s) {
        ArrayList<Character> arrayList1 = new ArrayList();
        ArrayList<Character> arrayList2 = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                arrayList1.add(ch);
            }else {
                arrayList2.add(ch);
            }
        }
        char result = ' ';
        for(char ch1 : arrayList1) {
            for(char ch2 : arrayList2) {
                if (ch1 == ch2) {
                    if (ch1 > result) {
                        result = ch1;
                    }
                }
            }
        }
        return "" + result;
    }
}