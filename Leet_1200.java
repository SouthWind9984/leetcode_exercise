package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/7/3
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1200 {

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{1, 3, 6, 10, 12}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int n1 = arr[i];
            int n2 = arr[i + 1];
            if (n2 - n1 == minDiff) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(n1);
                list.add(n2);
                ansList.add(list);
            }
        }
        return ansList;
    }
}
