package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1189 {

    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        text = text.replaceAll("[^balon]+", "");
        int[] arr = new int[26];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            int index = text.charAt(i) - 'a';
            arr[index]++;
        }
        int min;
        min = Math.min(arr[1], arr[0]);
        min = Math.min(min, arr['l' - 'a'] / 2);
        min = Math.min(min, arr['n' - 'a']);
        min = Math.min(min, arr['o' - 'a'] / 2);
        return min;
    }


}
