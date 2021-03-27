package leetcode_exercise;

import java.util.Arrays;

public class Lt_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = n-1; i >=0; i--) {
                nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
