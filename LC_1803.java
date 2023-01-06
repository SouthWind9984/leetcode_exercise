package LeetCode_ADailyTopic;

/**
 * 2023/1/5 10:06
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_1803 {
    public int countPairs(int[] nums, int low, int high) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int n = nums[i];
            for (int j = i + 1; j < len; j++) {
                int m = nums[j];
                int k = n ^ m;
                if (k>=low && k<=high){
                    res++;
                }
            }
        }
        return res;
    }

}
