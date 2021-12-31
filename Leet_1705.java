package LeetCode_ADailyTopic;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SouthWind
 * @date 2021/12/24
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1705 {

    public static void main(String[] args) {

    }

    class Solution {
        public int eatenApples(int[] apples, int[] days) {
            PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            int n = apples.length, time = 0, ans = 0;
            while (time < n || !q.isEmpty()) {
                if (time < n && apples[time] > 0) q.add(new int[]{time + days[time] - 1, apples[time]});
                while (!q.isEmpty() && q.peek()[0] < time) q.poll();
                if (!q.isEmpty()) {
                    int[] cur = q.poll();
                    if (--cur[1] > 0 && cur[0] > time) q.add(cur);
                    ans++;
                }
                time++;
            }
            return ans;
        }
    }
}
