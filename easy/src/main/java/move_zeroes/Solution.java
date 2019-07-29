package move_zeroes;

import com.google.common.primitives.Ints;

/**
 * @Author: Shoukai Huang
 * @Date: 2019/7/29 21:27
 */
class Solution {

    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            } else {
                if (k != 0) {
                    nums[i - k] = nums[i];
                    nums[i] = 0;
                }
            }
            if (i + k >= nums.length) {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums ={0,1,0};
        int[] nums = {1};
        moveZeroes(nums);
        System.out.println(Ints.asList(nums));
    }
}
