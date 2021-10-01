package LeetCode_ADailyTopic;

public class Leet_810 {

    public static void main(String[] args) {

    }

    public boolean xorGame(int[] nums) {
        int len = nums.length;
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res == 0 && len % 2 == 0;
    }
}
