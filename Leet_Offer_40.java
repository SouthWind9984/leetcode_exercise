package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leet_Offer_40 {
    public static void main(String[] args) {

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        //1.优先队列
        int[] ans = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            priorityQueue.offer(arr[i]);
            priorityQueue.offer(arr[j]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = priorityQueue.poll();
        }
        //2.快排,返回目标数组
        Arrays.sort(arr);
        int[] ints = Arrays.copyOfRange(arr, 0, k);
        return ints;
    }
}
