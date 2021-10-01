package LeetCode_ADailyTopic;

import java.util.*;

public class Leet_692 {
    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "ac";
        System.out.println(s2.compareTo(s1));
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        //统计所有单词的数量
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        //优先队列，自定义排序结构
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            //次数相等比较字典大小，大的在前，小的在后 ； 次数不同，多的在后
            @Override
            public int compare(String o1, String o2) {
                int count1 = map.get(o1);
                int count2 = map.get(o2);
                if (count1 == count2) {
                    return o2.compareTo(o1);
                } else
                    return count1 - count2;
            }
        });
        for (String s : map.keySet()) {
            priorityQueue.offer(s);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue);
        LinkedList<String> ans = new LinkedList<>();
        while (!priorityQueue.isEmpty()) {
            ans.addFirst(priorityQueue.poll());
        }
        return ans;
    }
}
