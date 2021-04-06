package leetcode_exercise;

import java.util.Arrays;

public class Leet_04 {
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len  = len1 + len2;
        int [] nums = new int [len];
        int n = 0;
        double res = 0;
        int index = 0;
        for (int tmp :nums1) nums[n++]=tmp;
        for (int tmp :nums2) nums[n++]=tmp;
        Arrays.sort(nums);
        index = len/2;
        if (len%2==0) res = nums[index];
        /*
        0 1 2 3 4 5
         */
        else res = (nums[index]+nums[index-1])*1.0/2;
        return res;
    }
}
