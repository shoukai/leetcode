package search_insert_position;

public class Solution {

    /**
     * Example 1:
     * Input: [1,3,5,6], 5
     * Output: 2
     * Example 2:
     * <p>
     * Input: [1,3,5,6], 2
     * Output: 1
     * Example 3:
     * <p>
     * Input: [1,3,5,6], 7
     * Output: 4
     * Example 1:
     * <p>
     * Input: [1,3,5,6], 0
     * Output: 0
     */
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(array, 5));
        System.out.println(searchInsert(array, 2));
        System.out.println(searchInsert(array, 7));
        System.out.println(searchInsert(array, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int begin, int end, int target) {
        if (begin == end) {
            if (nums[begin] >= target) {
                return begin;
            } else {
                return begin + 1;
            }
        }
        int middle = (end - begin) / 2 + begin;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] > target) {
            return search(nums, begin, middle, target);
        } else {
            return search(nums, middle + 1, end, target);
        }
    }
}
