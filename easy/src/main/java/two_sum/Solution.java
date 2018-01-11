package two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] rs = new int[2];
                    rs[0] = i;
                    rs[1] = j;
                    return rs;
                }
            }
        }
        return new int[2];
    }
}