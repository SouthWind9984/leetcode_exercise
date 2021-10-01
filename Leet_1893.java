package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.Comparator;

public class Leet_1893 {
    public static void main(String[] args) {

    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        int res = 0;
        Arrays.sort(ranges, Comparator.comparingInt(o -> Arrays.stream(o).sum()));
//        差分数组
        for (int[] range : ranges) {
            System.out.println(Arrays.toString(range));
            if (range[0] <= left && range[1] >= left) {
                res++;
            }
            if (range[0] <= right && range[1] >= right) {
                res++;
            }
        }
        return res == 2;
    }

}
