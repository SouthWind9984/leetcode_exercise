package LeetCode_ADailyTopic;

public class Leet_231 {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            n *= -1;
        }
        while (n > 1) {
            double m = n * 1.0 / 2;
            n /= 2;
            System.out.println(m + " " + n);
            if (m != n) {
                return false;
            }
        }
        return true;
    }
}
