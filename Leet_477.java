package LeetCode_ADailyTopic;

public class Leet_477 {
    public static void main(String[] args) {

    }

    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < 31; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if ((nums[j] >> i & 1) == 1) {
                    count++;
                }
            }
            res += count * (len - count);
        }
        return res;
    }
}
