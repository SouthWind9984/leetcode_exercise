package leetcode_exercise;

import java.util.Arrays;

public class Leet_1846 {

    public static void main(String[] args) {


    }

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        arr[0] = 1;
        for (int i = 1; i < len; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[len - 1];
    }
}
