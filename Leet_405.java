package LeetCode_ADailyTopic;


public class Leet_405 {
    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }

    /**
     * 取余数，按权展开
     *
     * @param num
     * @return
     */
    public static String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        long number = num;
        if (number < 0) {
            number = (long) (Math.pow(2, 32) + number);
        }
        while (number > 0) {
            long tmp = number % 16;
            char ch = tmp >= 10 ? (char) (tmp - 10 + 'a') : (char) (tmp + '0');
            sb.append(ch);
            number /= 16;
        }
        return sb.reverse().toString();
    }
}
