package LeetCode_ADailyTopic;

public class Leet_Offer_53 {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int res = 0;
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                right = mid;
            }
        }
        return res;
    }

}
