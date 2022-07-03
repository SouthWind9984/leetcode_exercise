package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/26
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_2016 {

    public static void main(String[] args) {

    }

    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int min = nums[0];
        int minIndex = 0;
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            if (num < min) {
                min = num;
                minIndex = i;
            }
        }
        int max = min;
        for (int i = minIndex + 1; i < len; i++) {
            int num = nums[i];
            if (num > max) {
                max = num;
            }
        }
        if (max != min) {
            return max - min;
        }
        return -1;
    }
}
