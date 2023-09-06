package Test1769;

public class Mine {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            int count = 0;
            //遍历字符串，查找1
            for(int j = 0; j < boxes.length(); j++){
                if (boxes.charAt(j) == '1') {
                    count += Math.abs(i - j);
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
