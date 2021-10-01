package LeetCode_ADailyTopic;

public class Leet_1442 {
    public static void main(String[] args) {

    }

    public int countTriplets(int[] arr) {
        int len = arr.length;
        int res = 0;
        for (int i = 0; i < len - 1; i++) {
            int n = arr[i];
            for (int j = i + 1; j < len; j++) {
                n ^= arr[j];
                if (n == 0) {
                    res += j - i;
                }
            }
        }
        return res;
    }
}
