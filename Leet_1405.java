package LeetCode_ADailyTopic;

import java.util.PriorityQueue;

/**
 * @author SouthWind
 * @date 2022/2/7
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1405 {

    public static void main(String[] args) {
        System.out.println(longestDiverseString(2, 2, 1));
    }

    //贪心算法
    public static String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        // 0-a,1-b,2-c
        queue.offer(new int[]{0, a});
        queue.offer(new int[]{1, b});
        queue.offer(new int[]{2, c});
        while (!queue.isEmpty()) {
            int[] peek = queue.poll();
            char ch = (char) ('a' + peek[0]);
            int length = ans.length();
            //一次只加一个字符，选最多的那个，倒数前两个字符和相同则选择次多的，如果为空，break返回。
            if (length >= 2 && ans.charAt(length - 1) == ch && ans.charAt(length - 2) == ch) {
                if (queue.isEmpty())
                    break;
                int[] next = queue.poll();
                if (next[1]-- > 0) {
                    ans.append((char) ('a' + next[0]));
                    queue.offer(next);
                } else
                    break;
                queue.offer(peek);
            } else {
                if (peek[1]-- > 0) {
                    ans.append(ch);
                    queue.offer(peek);
                } else
                    break;
            }
        }
        return ans.toString();
    }

}
