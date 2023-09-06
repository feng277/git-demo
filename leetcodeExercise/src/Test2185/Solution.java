package Test2185;

//class Solution {
//    public static int prefixCount(String[] words, String pref) {
//        int count = 0;
//        for (int i = 0; i < words.length; i++) {
//            A:
//            {
//                for (int j = 0; j < pref.length(); j++) {
//                    if (pref.charAt(j) != words[i].charAt(j)) {
//                        i++;
//                        break A;
//                    }
//                }
//                count++;
//            }
//        }
//        return count;
//    }
//}
class Solution {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        String s = "";
        for (String str : words) {
            try{
                s = str.substring(0,pref.length());
            }catch(Exception e) {
                continue;
            }
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }
}