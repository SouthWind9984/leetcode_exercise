package LeetCode_ADailyTopic;


import java.util.TreeSet;

public class Leet_414 {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        int len = treeSet.size();
        if (len > 2) {
            int res = 0;
            for (int i = 0; i < 3; i++) {
                res = treeSet.pollLast();
            }
            return res;
        } else {
            return treeSet.pollLast();
        }
    }
}
