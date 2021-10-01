package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Leet_1482 {
    public static void main(String[] args) {

    }

    /*
    找最短时间开花，并且相邻
    二分查找
    时长最短，试探性找寻
     */
    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        //花园中的花束小于所需花束，返回-1
        if (len < m * k) return -1;
        //找寻数组中最大值和最小值
        int right = Arrays.stream(bloomDay).max().getAsInt();
        int left = Arrays.stream(bloomDay).min().getAsInt();
        //不断去试探最短时间
        while (left < right) {
            int min = (left + right) / 2;
            if (check(bloomDay, m, k, min)) {
                right = min;
            } else {
                left = min + 1;
            }
        }
        return left;
    }

    //当前时间可开的花束
    private boolean check(int[] bloom, int m, int k, int time) {
        //所开花束总数
        int count = 0;
        int len = bloom.length;
        int n = 0;
        for (int i = 0; i < len; i++) {
            //大于当前时间
            if (bloom[i] > time) {
                n = 0;
                continue;
            }
            //找连续的花束
            n++;
            if (n == k) {
                count++;
                n = 0;
            }
            if (count == m) {
                return true;
            }
        }
        return false;
    }
}
