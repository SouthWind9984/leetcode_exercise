package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/2/19
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_969 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {3, 2, 4, 1};
        int len = arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.println(solution.pancakeSort(arr));
    }

    static class Solution {

        List<Integer> ansList = new ArrayList<>();

        /**
         * 煎饼排序
         * 先找到最大值，翻到最前面，然后再翻到最后
         * 依次这样做
         */
        public List<Integer> pancakeSort(int[] arr) {
            int len = arr.length;
            int[] clone = arr.clone();
            Arrays.sort(clone);
            while (!Arrays.equals(arr, clone)) {
                int index = maxIndex(arr, len);
                if (index == 0) {
                    //最大值已经在最前面，直接翻转到后面
                    reserveArr(arr, len);
                } else if (index != len) {
                    //找到未排序中的最大值，将它翻到前面
                    reserveArr(arr, index + 1);
                    //然后翻转到后面（前一个最大值前面）
                    reserveArr(arr, len);
                }
                //没排序一次，缩短未排序数组的长度
                len--;
            }
            return ansList;
        }

        // 翻转
        public void reserveArr(int[] arr, int k) {
            for (int i = 0; i < k / 2; i++) {
                int tmp = arr[i];
                arr[i] = arr[k - i - 1];
                arr[k - i - 1] = tmp;
            }
            ansList.add(k);
        }

        /**
         * 未排序的数组中最大值的小标
         *
         * @param arr 待排序数组
         * @param len 还没排好顺序数组的长度
         * @return
         */
        public int maxIndex(int[] arr, int len) {
            int index = 0;
            int max = arr[0];
            for (int i = 0; i < len; i++) {
                int num = arr[i];
                if (num > max) {
                    max = num;
                    index = i;
                }
            }
            return index;
        }

    }


}
