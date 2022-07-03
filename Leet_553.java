package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/27
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_553 {

    public String optimalDivision(int[] nums) {
        if (nums.length == 1) return "" + nums[0];
        if (nums.length == 2) return "" + nums[0] + "/" + nums[1];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nums[0]).append("/(");
        for (int i = 1; i < nums.length; i++) {
            stringBuilder.append(nums[i]).append("/");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1).append(")");
        return stringBuilder.toString();
    }
}
