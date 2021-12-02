package LeetCode_ADailyTopic;


public class Leet_400 {
    public static void main(String[] args) {
        System.out.println(findNthDigit((int) Math.pow(2, 31 - 1)));
    }

    public static int findNthDigit(int n) {
        // 模拟运算堆空间溢出
        StringBuilder sBuilder = new StringBuilder();
        int num = 1;
        while (sBuilder.length() < n) {
            sBuilder.append(num);
            num++;
        }
        char c = sBuilder.charAt(n - 1);
        return c - 48;
    }
}




