package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_368 {
    public static void main(String[] args) {
        int[] nums = {5, 9, 18, 54, 108, 540, 90, 180, 360, 720};
        largestDivisibleSubset(nums);
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        /*
        动态规划
        动态转移方程：
         */
        Arrays.sort(nums);
        int len = nums.length;
        int[] arr_length = new int[len];
        int[] arr_index = new int[len];
        for (int i = 0; i < len; i++) {
            int n = 1, curr = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (arr_length[j] + 1 > n) {
                        n = arr_length[j] + 1;
                        curr = j;
                    }
                }
            }
            arr_length[i] = n;
            arr_index[i] = curr;
        }
        int max = -1, index = -1;
        for (int i = 0; i < len; i++) {
            if (arr_length[i] > max) {
                max = arr_length[i];
                index = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() != max) {
            list.add(nums[index]);
            index = arr_index[index];
        }
        return list;
    }
}

