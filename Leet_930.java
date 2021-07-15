package leetcode_exercise;

public class Leet_930 {
    public static void main(String[] args) {
        jiecheng(4);
    }

    private static void jiecheng(int n) {
        int jc = 1;
        for (int i = 1; i <= n; i++) {
            jc *= i;
        }
        System.out.println(jc);
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        int len = nums.length;
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return res;
    }
}
