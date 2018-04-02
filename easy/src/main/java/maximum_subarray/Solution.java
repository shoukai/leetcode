package maximum_subarray;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(array));
        array = new int[]{1};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i; j < nums.length; j++) {
                tmp += nums[j];
                if (tmp >= max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

}
