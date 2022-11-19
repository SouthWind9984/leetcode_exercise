package LeetCode_ADailyTopic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SouthWind
 * @date 2022/10/17 22:47
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_904 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2};
        totalFruit(arr);
    }

    public static int totalFruit(int[] fruits) {
        int len = fruits.length;
        int left = 0;
        int right = 1;
        int max = 0;
        while (right < len) {
            Set<Integer> set = new HashSet<>();
            set.add(fruits[left]);
            while (right < len && set.size() <= 2) {
                set.add(fruits[right]);
                right++;
            }
            max = Math.max(max, right - left);
            left++;
            right = left + 1;
        }
        return max;
    }
}

