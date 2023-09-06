public class Test795 {
    public static void main(String[] args) {
        int[] nums = {16, 69, 88, 85, 79, 87, 37, 33, 39, 34};
        int left = 55;
        int right = 57;
        int count = 0;
        //int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < left) {
                nums[i] = -1;
            } else if (nums[i] > right) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        //分割数组
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                rightIndex = i;
                int[] arr = new int[rightIndex - leftIndex];
                for (int j = 0; j < rightIndex - leftIndex; j++) {
                    arr[j] = nums[j + leftIndex];
                }
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < j; k++) {
                        for (int find0 = k; find0 <= j; find0++) {
                            if (arr[find0] == 0) {
                                count++;
                                break;
                            }
                        }
                    }
                    if (arr[j] == 0) {
                        count++;
                    }
                }
                leftIndex = rightIndex + 1;

            }
            if (i == nums.length - 1) {
                rightIndex = i;
                int[] arr0 = new int[rightIndex - leftIndex + 1];
                for (int j = 0; j < rightIndex - leftIndex + 1; j++) {
                    arr0[j] = nums[j + leftIndex];
                }
                for (int j = 0; j < arr0.length; j++) {
                    for (int k = 0; k < j; k++) {
                        for (int find0 = k; find0 <= j; find0++) {
                            if (arr0[find0] == 0) {
                                count++;
                                break;
                            }
                        }
                    }
                    if (arr0[j] == 0) {
                        count++;
                    }
                }
                leftIndex = rightIndex + 1;
            }
        }
        System.out.println(count);
    }
}

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < left) {
                nums[i] = -1;
            } else if (nums[i] > right) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }

        //分割数组
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                boolean flag = true;
                boolean temp = false;
                rightIndex = i;
                int[] arr = new int[rightIndex - leftIndex];
                for (int j = 0; j < rightIndex - leftIndex; j++) {
                    arr[j] = nums[j + leftIndex];
                }
                for (int a = 0; a < arr.length; a++) {
                    if (arr[a] == -1 && arr[a] == 1) {
                        flag = false;
                    } else if (arr[a] == 1) {
                        temp = false;
                    }
                }
                if (flag) {
                    for (int b = 1; b <= nums.length; b++) {
                        count += i;
                    }
                    continue;
                } else if (temp) {
                    continue;
                }
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < j; k++) {
                        for (int find0 = k; find0 <= j; find0++) {
                            if (arr[find0] == 0) {
                                count++;
                                break;
                            }
                        }
                    }
                    if (arr[j] == 0) {
                        count++;
                    }
                }
                leftIndex = rightIndex + 1;
            }
            if (i == nums.length - 1) {
                boolean flag = true;
                boolean temp = false;
                rightIndex = i;
                int[] arr0 = new int[rightIndex - leftIndex + 1];
                for (int j = 0; j < rightIndex - leftIndex + 1; j++) {
                    arr0[j] = nums[j + leftIndex];
                }
                for (int a = 0; a < arr0.length; a++) {
                    if (arr0[a] == -1 && arr0[a] == 1) {
                        flag = false;
                    } else if (arr0[a] == 1) {
                        temp = false;
                    }
                }
                if (flag) {
                    for (int b = 1; b <= nums.length; b++) {
                        count += i;
                    }
                    continue;
                } else if (temp) {
                    continue;
                }
                for (int j = 0; j < arr0.length; j++) {
                    for (int k = 0; k < j; k++) {
                        for (int find0 = k; find0 <= j; find0++) {
                            if (arr0[find0] == 0) {
                                count++;
                                break;
                            }
                        }
                    }
                    if (arr0[j] == 0) {
                        count++;
                    }
                }
                leftIndex = rightIndex + 1;
            }
        }
        return count;
    }
}