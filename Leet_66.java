package LeetCode_ADailyTopic;

public class Leet_66 {
    public static void main(String[] args) {
        char a = '0';
        System.out.println((int) a);
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int ans[] = new int[len + 1];
        ans[0] = 1;
        return ans;
    }
}
