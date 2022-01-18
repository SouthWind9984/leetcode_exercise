package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/12
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_334 {

    public static void main(String[] args) {

    }

    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            if (a >= num) {
                a = num;
            } else if (b >= num) {
                b = num;
            } else {
                return true;
            }
        }
        return false;
    }

}
