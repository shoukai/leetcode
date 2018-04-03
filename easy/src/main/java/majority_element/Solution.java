package majority_element;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 1, 0, 1, 1, 1, 1, 1, 1, 101};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
