package LeetCode_ADailyTopic;

public class Leet_645 {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int len = nums.length;
        int[] ints = new int[len + 1];
        for (int num : nums) {
            ints[num]++;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                res[1] = i;
            }
            if (ints[i] == 2) {
                res[0] = i;
            }
        }
        return res;
    }
}
