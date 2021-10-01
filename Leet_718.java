package LeetCode_ADailyTopic;

public class Leet_718 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        findLength(nums1, nums2);
    }

    public static int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] max_arr = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            max_arr[i][0] = 0;
        }
        for (int i = 0; i <= len2; i++) {
            max_arr[0][i] = 0;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    max_arr[i][j] = max_arr[i - 1][j - 1] + 1;
                } else {
                    max_arr[i][j] = Math.max(max_arr[i - 1][j], max_arr[i][j - 1]);
                }
                System.out.print(max_arr[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < max_arr.length; i++) {
            for (int j = 0; j < max_arr[0].length; j++) {
                System.out.print(max_arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(max_arr[len1][len2]);
        return max_arr[len1][len2];
    }
}
