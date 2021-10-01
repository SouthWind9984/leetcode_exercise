package LeetCode_ADailyTopic;

public class Leet_268 {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] count = new int[len + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i <= len; i++) {
            if (count[i] == 0)
                return i;
        }
        return len;
    }
}
