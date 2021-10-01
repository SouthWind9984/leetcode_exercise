package LeetCode_ADailyTopic;

public class Leet_128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestConsecutive(nums);
    }

    public static int longestConsecutive(int[] nums) {
//        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        StringBuffer sb = null;
        System.out.println(nums.toString());
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        String str = sb.toString();
        boolean[] booleans = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {

        }
        return 0;
    }
}
