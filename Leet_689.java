package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/8
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_689 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a * c;
        System.out.println(c + " " + d);
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
        int len = nums.length;
        int n = len - k + 1;
        int[] sumArr = new int[n];
        // 记录临时的值
        int tmpSum = 0;
        for (int i = 0; i < len; i++) {
            tmpSum += nums[i];
            if (i >= k) {
                tmpSum -= nums[i - k];
            }
            if (i >= k - 1)
                sumArr[i - k + 1] = tmpSum;
        }
        //右侧最大下标
        int[] rightArr = new int[n];
        int maxIndex = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (sumArr[maxIndex] < sumArr[i]) {
                maxIndex = i;
            }
            rightArr[i] = maxIndex;
        }
        // 左侧最大下标
        int[] leftArr = new int[n];
        maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (sumArr[maxIndex] < sumArr[i]) {
                maxIndex = i;
            }
            leftArr[i] = maxIndex;
        }
        int[] ans = new int[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = -1;
        }
        for (int i = k; i < n - k; i++) {
            if (ans[0] == -1 || sumArr[ans[0]] + sumArr[ans[1]] + sumArr[ans[2]] <
                    sumArr[i] + sumArr[leftArr[i - k]] + sumArr[rightArr[i + k]]) {
                ans[0] = leftArr[i - k];
                ans[1] = i;
                ans[2] = rightArr[i + k];
            }
        }
        return ans;
    }

}
