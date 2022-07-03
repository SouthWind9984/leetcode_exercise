package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2022/7/3
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_556 {
    public static void main(String[] args) {

        System.out.println(nextGreaterElement(2147483486));  //53914

    }

    public static int nextGreaterElement(int n) {
        int tmp = n;
        int len = 0;
        while (tmp > 0) {
            tmp /= 10;
            len++;
        }
        int[] nums = new int[len];
        tmp = n;
        while (tmp > 0) {
            nums[--len] = tmp % 10;
            tmp /= 10;
        }
//        System.out.println(Arrays.toString(nums));
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            int num1 = nums[i];
            int num2 = nums[i - 1];
            if (num1 > num2) {
                index = i - 1;
                break;
            }
        }
        if (index == -1) return -1;
        for (int i = nums.length - 1; i > 0; i--) {
            int num = nums[i];
            if (num > nums[index]) {
                nums[i] = nums[index];
                nums[index] = num;
                break;
            }
        }
        Arrays.sort(nums, index + 1, nums.length);
//        System.out.println(Arrays.toString(nums));
        long ans = 0;
        for (int num : nums) {
            ans = ans * 10 + num;
        }
        return Math.toIntExact(ans > Integer.MAX_VALUE ? -1 : ans);
    }
}
