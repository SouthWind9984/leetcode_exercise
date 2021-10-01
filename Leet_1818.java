package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Leet_1818 {
    public static void main(String[] args) {

    }
    /*
    二分查找
    每次作差时，从复制并排序的数组中找一个想接近的数，即差最小（贪心还不够），计算替换后结果的变化，变小满足条件，否则舍弃
     */

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//        拷贝数组
        int[] nums3 = nums1;
//        排序
        Arrays.sort(nums3);

        int len = nums1.length;
        long res = 0;
        int max_abs = -1;
        for (int i = 0; i < len; i++) {
            //找绝对值最小，且两者差最大
            int abs = Math.abs(nums1[i] - nums2[i]);
            int left = 0, right = len;
            while (left < right) {
                int mid = (left + right) / 2;

            }
            res += abs;
        }

        //3.从答案中减去最大绝对值的差
        res -= max_abs;
        return (int) (res % (1e9 + 7));
    }
}
