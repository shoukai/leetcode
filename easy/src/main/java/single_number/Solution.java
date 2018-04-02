package single_number;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 1, 2, 4, 3, 3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
