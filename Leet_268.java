package LeetCode_ADailyTopic;

import java.util.stream.IntStream;

/**
 * @author SouthWind
 */
public class Leet_268 {
    public static void main(String[] args) {

    }

    /**
     * 借用数组存放临时数据
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] count = new int[len + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i <= len; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return len;
    }

    /**
     * 异或
     */
    public int missingNumber2(int[] nums) {
        return IntStream.range(0, nums.length).map(i -> nums[i] ^ (i + 1)).reduce(0, (a, b) -> a ^ b);
    }
}
