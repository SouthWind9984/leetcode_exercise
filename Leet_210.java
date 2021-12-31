package LeetCode_ADailyTopic;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SouthWind
 * @date 2021/12/21
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_210 {
    public static void main(String[] args) {

    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        if (numCourses == 1) return new int[]{0};
        // 想修a,必须先修b
        for (int[] prerequisite : prerequisites) {
            int a = prerequisite[0];
            int b = prerequisite[1];
            queue.offer(b);
            queue.offer(a);
        }
        System.out.println(queue);
        return new int[0];
    }
}
