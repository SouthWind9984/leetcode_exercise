package LeetCode_ADailyTopic;

import java.util.List;
import java.util.TreeSet;

/**
 * @author SouthWind
 * @date 2022/1/18
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_539 {

    public static void main(String[] args) {

    }

    public int findMinDifference(List<String> timePoints) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (String s : timePoints) {
            int index = s.indexOf(":");
            int hour = Integer.parseInt(s.substring(0, index));
            int minute = Integer.parseInt(s.substring(index + 1));
            int time = hour * 60 + minute;
            if (treeSet.contains(time)) {
                return 0;
            }
            treeSet.add(time);
        }
        int ans = Integer.MAX_VALUE;
        int first = treeSet.first();
        int pre = treeSet.pollFirst();
        while (!treeSet.isEmpty()) {
            int suffix = treeSet.pollFirst();
            ans = Math.min(ans, suffix - pre);
            pre = suffix;
        }
        return Math.min(ans, first + 1440 - pre);
    }
}
