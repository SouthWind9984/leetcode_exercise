package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/28 8:23
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1822 {


    public int arraySign(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                count++;
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
