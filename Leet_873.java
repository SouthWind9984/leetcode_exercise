package LeetCode_ADailyTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SouthWind
 * @date 2022/7/9
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_873 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 11, 12, 14, 18};
        lenLongestFibSubseq(arr);
    }

    public static int lenLongestFibSubseq(int[] arr) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp1 = arr[i];
                int tmp2 = arr[j];
                int count = 2;
                int sum = tmp1 + tmp2;
                while (set.contains(sum)) {
                    tmp1 = sum;
                    sum = sum + tmp2;
                    tmp2 = tmp1;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans > 2 ? ans : 0;
    }

}
