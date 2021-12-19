package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/19
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_997 {
    public static void main(String[] args) {

    }

    public int findJudge(int n, int[][] trust) {
        int[] ints = new int[n];
        for (int[] value : trust) {
            int b = value[1];
            int a = value[0];
            ints[a - 1]--;
            ints[b - 1]++;
        }
        for (int i = 0; i < n; i++) {
            int count = ints[i];
            if (count >= n - 1)
                return i + 1;
        }
        return -1;
    }

}
