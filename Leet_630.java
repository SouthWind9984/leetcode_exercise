package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SouthWind
 * @date 2021/12/14
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_630 {

    public static void main(String[] args) {

    }

    class Solution {
        public int scheduleCourse(int[][] courses) {
            Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
            PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
            int sum = 0;
            for (int[] c : courses) {
                int d = c[0], e = c[1];
                sum += d;
                q.add(d);
                if (q.size() > 0 && sum > e) sum -= q.poll();
            }
            return q.size();
        }
    }
}
