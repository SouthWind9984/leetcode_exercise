package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/1/13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_747 {

    public static void main(String[] args) {

    }


    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int a = -1, b = a, index = 0;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num > a) {
                b = a;
                a = num;
                index = i;
            } else if (num > b) {
                b = num;
            }
        }
        System.out.println(a + " " + b);
        return a / b > 3 ? index : -1;
    }
}
