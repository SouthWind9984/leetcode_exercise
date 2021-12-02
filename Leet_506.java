package LeetCode_ADailyTopic;


import java.util.Map;
import java.util.TreeMap;

public class Leet_506 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 9, 4, 8, 5, 7};
        findRelativeRanks(nums);
    }

    public static String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        String[] ans = new String[len];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);
        }
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            switch (len - n) {
                case 1:
                    ans[value] = "Gold Medal";
                    break;
                case 2:
                    ans[value] = "Silver Medal";
                    break;
                case 3:
                    ans[value] = "Bronze Medal";
                    break;
                default:
                    ans[value] = String.valueOf(len - n);
                    break;
            }
            n++;
        }
        return ans;
    }

}
