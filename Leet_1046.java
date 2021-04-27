package leetcode_exercise;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leet_1046 {
    public static void main(String[] args) {

    }

    public int lastStoneWeight(int[] stones) {
        //最大根堆 ,反转优先队列实现最大堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if (stone1 != stone2) {
                maxHeap.offer(stone1 - stone2);
            }
        }
        return maxHeap.size() == 0 ? 0 : maxHeap.poll();
    }
}
