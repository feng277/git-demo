public class Test53 {
    public static void main(String[] args) {
        int[] nums = {-2,1};
        int maxSum = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j <= i; j++) {
                int sum = 0;
                for(int k = j; k <= i; k++){
                    sum += nums[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
