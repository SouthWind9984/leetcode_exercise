package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/13 15:01
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_769 {
    public static void main(String[] args) {

    }

    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int ans = 1, max = 0;
        for (int i = 0; i < len; i++) {
            int n = arr[i];
            max = Math.max(max, arr[i]);
            if (max == i) ans++;
        }
        return ans;
    }

}
