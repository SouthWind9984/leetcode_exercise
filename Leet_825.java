package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/27
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_825 {

    public int numFriendRequests(int[] ages) {
        int[] counts = new int[121];
        for (int age : ages) {
            counts[age]++;
        }

        // 整理成前缀和数组
        int[] preSum = new int[121];
        preSum[0] = counts[0];
        for (int i = 1; i < counts.length; i++) {
            preSum[i] = preSum[i - 1] + counts[i];
        }

        int ans = 0;

        // x小于14时，没有这样的y，所以从15开始
        for (int x = 15; x < counts.length; x++) {
            if (counts[x] > 0) {
                int y = (int) (0.5 * x + 7);
                // preSum[x] - preSum[y] 是区间 (y,x] 的总人数
                // -1 表示去掉自己
                // * counts[x] 表示 x 年龄的人数
                ans += (preSum[x] - preSum[y] - 1) * counts[x];
            }
        }

        return ans;
    }
}
