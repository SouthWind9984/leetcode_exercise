package LeetCode_ADailyTopic;

public class Leet_12 {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] lmap = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < lmap.length; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                res.append(lmap[i]);
            }
        }
        return res.toString();
    }
}
