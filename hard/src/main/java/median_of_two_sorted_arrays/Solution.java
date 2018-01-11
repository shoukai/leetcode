package median_of_two_sorted_arrays;

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        boolean one = (nums1.length + nums2.length) % 2 == 1;
        int mark = (nums1.length + nums2.length) / 2;
        mark = mark + 1;
        int p1 = 0;
        int p2 = 0;

        int last1 = 0;
        int last2 = 0;

        for (int i = 0; i < mark; i++) {
            last2 = last1;
            if (p1 >= nums1.length) {
                last1 = nums2[p2];
                p2++;
            } else if (p2 >= nums2.length) {
                last1 = nums1[p1];
                p1++;
            } else {
                if (nums1[p1] >= nums2[p2]) {
                    last1 = nums2[p2];
                    p2++;
                } else {
                    last1 = nums1[p1];
                    p1++;
                }
            }
        }
        if (one) {
            return last1;
        } else {
            double rs = last1 + last2;
            return rs / 2;
        }
    }
}
