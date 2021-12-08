package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2021/12/8
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_689 {
    public static void main(String[] args) {

    }

    /**
     * 寻找三个无重叠子数组和最大化
     * 维护最大值
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        //加上步长，不超过数组下标
        for (int i = 0; i <= len - k; i++) {
            // 记录临时的值
            int tmpSum = 0;
            for (int j = i; j < i + k; j++) {
                tmpSum += nums[j];
            }
            list.add(tmpSum);
        }
        int[] ans = new int[3];
        //动态规划，dp[i] = Math.max(dp[i-1],list.get(i)+dp[i-k])
        int prev = 0;
        int curr = 0;
        for (int i : list) {
            int temp = Math.max(curr, prev + i);
            prev = curr;
            curr = temp;
        }
        return nums;
    }
}
