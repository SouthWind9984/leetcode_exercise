package LeetCode_ADailyTopic;

import java.util.PriorityQueue;

/**
 * @author SouthWind
 * @date 2022/10/5 19:42
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_01 {
    public int lastMaterial(int[] material) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i : material) {
            priorityQueue.offer(i);
        }
        while (priorityQueue.size() > 1) {
            int poll = priorityQueue.poll();
            int peek = priorityQueue.poll();
            int i = poll - peek;
            priorityQueue.add(i);
        }
        return priorityQueue.size() == 0 ? 0 : priorityQueue.poll();
    }
}
