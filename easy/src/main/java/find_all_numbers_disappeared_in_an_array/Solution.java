package find_all_numbers_disappeared_in_an_array;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
        nums = new int[]{1, 1};
        System.out.println(findDisappearedNumbers(nums));
        nums = new int[]{2, 2};
        System.out.println(findDisappearedNumbers(nums));
        nums = new int[]{5, 4, 6, 7, 9, 3, 10, 9, 5, 6};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // FIXME

        return null;
    }

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        if (nums.length == 0) {
//            return new ArrayList<>();
//        }
//        Arrays.sort(nums);
//        List<Integer> result = new ArrayList<>();
//        int point = nums[nums.length - 1] >= nums.length ? nums[nums.length - 1] : nums.length;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            while (point > nums[i]) {
//                result.add(point);
//                point--;
//            }
//            if (point == nums[i]) {
//                point--;
//            }
//        }
//        while (point > 0) {
//            result.add(point);
//        }
//        return result;
//    }
}
