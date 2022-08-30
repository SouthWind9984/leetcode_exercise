package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/8/27
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_704 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(solution.search(arr, target));
    }


    static class Solution {

        public int search(int[] nums, int target) {
            int len = nums.length;
            int r = 0, l = len - 1;
            while (r <= l) {
                int mid = (r + l) / 2;
                if (nums[mid] > target) {
                    l = mid - 1;
                } else if (nums[mid] < target) {
                    r = mid + 1;
                } else {
                    return mid;
                }
            }
            return r;
        }
    }
}
