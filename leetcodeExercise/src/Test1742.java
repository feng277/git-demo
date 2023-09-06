public class Test1742 {
    public static void main(String[] args) {
        int lowLimit = 1;
        int heightLimit = 100000;
        int arr[] = new int[54];
        for(int ballNum = lowLimit; ballNum <= heightLimit; ballNum++) {
            int num1 = 0;
            int num10 = 0;
            int num100 = 0;
            int num1000 = 0;
            int num10000 = 0;
            int num100000 = 0;
            if(ballNum < 10){
                num1 = ballNum;
            }else if(ballNum < 100){
                num1 = ballNum % 10;
                num10 = ballNum / 10;
            }else if(ballNum < 1000){
                num100 = ballNum / 100;
                num10 = ballNum / 10 % 10;
                num1 = ballNum % 10;
            }else if(ballNum < 10000){
                num1000 = ballNum / 1000;
                num100 = ballNum % 1000 / 100;
                num10 = ballNum % 100 / 10;
                num1 = ballNum % 10;
            }else if(ballNum < 100000){
                num10000 = ballNum / 10000;
                num1000 = ballNum % 10000 / 1000;
                num100 = ballNum % 1000 / 100;
                num10 = ballNum % 100 / 10;
                num1 = ballNum % 10;
            }else if(ballNum < 1000000){
                num100000 = ballNum / 100000;
                num10000 = ballNum % 100000 / 10000;
                num1000 = ballNum % 10000 / 1000;
                num100 = ballNum % 1000 / 100;
                num10 = ballNum % 100 / 10;
                num1 = ballNum % 10;
            }
            int compare = num1 + num10 + num100 + num1000 + num10000 + num100000;
            for (int i = 0; i < arr.length; i++) {
                    arr[compare - 1]++;
                    break;
            }
        }
        //找到数组中最大的数值
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
