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
        while (treeSet.size() > 3) {
            treeSet.pollLast();
        }
        return treeSet.pollLast();
    }
}
