package Test1781;

class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int left = 0; left < s.length(); left++) {
            for(int right = left; right <= s.length(); right++) {
                short[] arr = new short[26];
                int maxNum = 0;
                int minNum = 500;
                for (int i = left; i < right; i++) {
                    arr[s.charAt(i) - 97]++;
                }
                for (int i = 0; i < arr.length && arr[i] != 0; i++) {
                    if(arr[i] > maxNum) {
                        maxNum = arr[i];
                    }else if(arr[i] < minNum) {
                        minNum = arr[i];
                    }
                }
                if (minNum != 500) {
                    sum += maxNum - minNum;
                }
            }
        }
        return sum;
    }
}