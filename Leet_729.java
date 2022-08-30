package LeetCode_ADailyTopic;

import java.util.TreeMap;

/**
 * @author SouthWind
 * @date 2022/7/5
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_729 {
    public static void main(String[] args) {
        System.out.println();
    }

    class MyCalendar {

        TreeMap<Integer, Integer> treeMap;

        public MyCalendar() {
            treeMap = new TreeMap<>();
        }

        public boolean book(int start, int end) {
//            返回小于或等于给定键的最大键，如果没有这样的键，则null
            Integer max = treeMap.floorKey(start);
//            返回大于或等于给定键的最小键，如果没有这样的键，则null
            Integer min = treeMap.ceilingKey(start);
            if ((max == null || treeMap.get(max) <= start) && (min == null || end <= min)) {
                treeMap.put(start, end);
                return true;
            }
            return false;
        }
    }

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
}
