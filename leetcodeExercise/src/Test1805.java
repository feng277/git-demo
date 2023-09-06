public class Test1805 {
    public static void main(String[] name) {
        String word = "16727888";
        System.out.println(numDifferentIntegers(word));
    }
//    public static int numDifferentIntegers(String word) {
//        String num = "";
//        int intNum;
//        int[] arrNum = new int[0];
//        //将word中的数字转换为String
//        for (int i = 0; i < word.length() + 1; i++) {
//            if (word.charAt(i) < 48 || word.charAt(i) > 57 && num != "") {
//                intNum = Integer.valueOf(num);
//                if(isFind(arrNum,intNum)) {//判断该数是否在arrNum存在
//                    num = "";
//                    continue;
//                }
//                //数组扩容
//                int[] temp = new int[arrNum.length + 1];
//                for (int j = 0; j < arrNum.length; j++) {
//                    temp[j] = arrNum[j];
//                }
//                temp[arrNum.length] = intNum;
//                arrNum = temp;
//
//                num = "";
//                continue;
//            }
//            if (word.charAt(i) > 48 && word.charAt(i) < 57) {
//                num += word.charAt(i);
//            }
//        }
//        //查找数字计数
//        return arrNum.length;
//    }
    public static boolean isFind(long[] arr,long str) {
        for (int i = 0; i < arr.length; i++) {
            if (str == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static int numDifferentIntegers(String word) {
        String num = "";
        long[] arrNum = new long[0];
        //int[] temp = new int[];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 47 && word.charAt(i) < 58) {
                num += word.charAt(i);
            }
            if (num != "" && i == word.length() - 1 || num != "" && word.charAt(i + 1) > 58) {
                long intNum = Integer.valueOf(num);
                if(isFind(arrNum,intNum)) {//判断该数是否在arrNum存在
                    num = "";
                    continue;
                }
                //数组扩容
                long[] temp = new long[arrNum.length + 1];
                for (int j = 0; j < arrNum.length; j++) {
                    temp[j] = arrNum[j];
                }
                temp[arrNum.length] = intNum;
                arrNum = temp;

                num = "";
            }
        }
        return arrNum.length;
    }
}

