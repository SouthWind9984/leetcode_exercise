package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author SouthWind
 * @date 2022/1/16
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_382 {
    public static void main(String[] args) {
        System.out.println(Math.random());
    }

    class Solution {
        List<Integer> list = new ArrayList<>();

        public Solution(ListNode head) {
            while (head.next != null) {
                int val = head.val;
                list.add(val);
                head = head.next;
            }
        }

        public int getRandom() {
            Random random = new Random();
            int anInt = random.nextInt(list.size());
            return list.get(anInt);
        }
    }
}
