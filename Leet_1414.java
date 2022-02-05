package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/2/3
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1414 {

    public static void main(String[] args) {
        int numbers = findMinFibonacciNumbers(3123832);
        System.out.println(numbers);
    }


    public static int findMinFibonacciNumbers(int k) {
        // 10e9 以内的数，44个就够
        int len = 44;
        int[] fbArr = new int[len];
        fbArr[0] = 1;
        fbArr[1] = 1;
        for (int i = 2; i < fbArr.length; i++) {
            fbArr[i] = fbArr[i - 1] + fbArr[i - 2];
        }
        int sum = 0;
        while (k > 0) {
            int i = len - 1;
            while (i >= 0) {
                int n = fbArr[i];
                if (k < n) {
                    i--;
                } else {
                    k -= n;
                    sum++;
                }
            }
        }
        return sum;
    }
}
