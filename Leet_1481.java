package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Leet_1481 {
    public static void main(String[] args) {

    }

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Arrays.sort(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return k;
    }
}
