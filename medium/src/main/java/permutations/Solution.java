package permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        huisu(nums,list,rs);
        return rs;
    }

    private static void huisu(int[] nums, List<Integer> list, List<List<Integer>> rs) {
        if (list.size() == nums.length){
            rs.add(new ArrayList<>(list));
        }else {
            for(int i =0;i<nums.length;i++){
                if (list.contains(nums[i])){
                    continue;
                }
                list.add(nums[i]);
                huisu(nums,list,rs);
                list.remove(list.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}