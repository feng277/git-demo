package Test557;

class Solution {
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = 0;
        int tempIndex;
        for (; rightIndex < arr.length; rightIndex++) {
            if (rightIndex == arr.length - 1 || arr[rightIndex + 1] == ' ' ) {
                tempIndex = rightIndex;
                int middle = (rightIndex - leftIndex) / 2 + leftIndex;
                //交换
                while (leftIndex <= middle) {
                    char temp = arr[leftIndex];
                    arr[leftIndex] = arr[rightIndex];
                    arr[rightIndex] = temp;
                    leftIndex++;
                    rightIndex--;
                }
                leftIndex = tempIndex + 2;
                rightIndex = tempIndex + 1;
                continue;
            }
        }
        return new String(arr);
    }
}