package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/4 15:07
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_162 {

    public static void main(String[] args) {


    }
    // 时间复杂度 O = log(N) 二分
    /*
    每一个开区间中间必定存在一个闭区间
     */

    public static int findPeakElement(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
    // 时间复杂度 O = N

    public static int findPeakElement1(int[] nums) {
        int len = nums.length;
        int max = 0;
        int ans = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ans = i;
            }
        }
        return ans;
    }
}
