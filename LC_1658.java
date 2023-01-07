package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * 2023/1/7 8:11
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_1658 {


    /*
    双指针，找到中间最长的片段之和等于 sum - x
     */
    public int minOperations(int[] nums, int x) {
        int len = nums.length;
        int sum = Arrays.stream(nums).sum();
        int n = sum - x;
        int l = 0,r = 0;
        int tmp = 0;
        int maxLen = -1;
        while (r < len) {
            tmp+=nums[r++];
            while (tmp > n && l<len){
                tmp -= nums[l++];
            }
            if (tmp == n){
                maxLen = Math.max(maxLen,r-l);
            }
        }
        return maxLen==-1?-1:len-maxLen;
    }
}
