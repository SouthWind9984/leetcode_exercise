package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author SouthWind
 * @date 2022/10/8 15:46
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_870 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        Integer[] index = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            index[i] = i;
        }
        System.out.println(Arrays.toString(index));
        Arrays.sort(index, Comparator.comparingInt(a -> arr[a]));
        System.out.println(Arrays.toString(index));
    }

    /*
    田忌赛马
     */
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] ans = new int[len];
        int[][] index = new int[len][2];
        for (int i = 0; i < len; i++) {
            index[i][0] = nums2[i];
            index[i][1] = i;
        }
        // nums1  从小到大排列，nums2 从大到小排列
        Arrays.sort(nums1);
        Arrays.sort(index, (o1, o2) -> o2[0] - o1[0]);
        //开始田忌赛马，若n1最大值打于n2最大值，就上去pk,否则用最小值去pk最大值
        int left = 0;
        int right = len - 1;
        for (int i = 0; i < len; i++) {
            if (nums1[right] > index[i][0]) {
                ans[index[i][1]] = nums1[right];
                right--;
            } else {
                ans[index[i][1]] = nums1[left];
                left++;
            }
        }
        return ans;
    }
}
