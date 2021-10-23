package LeetCode_ADailyTopic;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Leet_229 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
        majorityElement(nums);
    }

    public static List<Integer> majorityElement(int[] nums) {

        int len = nums.length;
        int target = len / 3;
        List<Integer> resList = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == target + 1) {
                resList.add(num);
            }
        }
        return resList;
    }
}
