package leetcode_exercise;

public class Leet_633 {
    public static void main(String[] args) {

    }

    public boolean judgeSquareSum(int c) {
        /*
        a^2 =sqrt c/2
        基础写法
        进阶
        0 - Math.sqrt(c/2)
        二分，双指针查找
         */
        for (int i = 0; i <= (int) Math.sqrt(c / 2); i++) {
            double sqrt = Math.sqrt(c - i * i);
            if (sqrt == (int) sqrt) {
                return true;
            }
        }
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left < right) {
            //调用库函数，效率大减
//            double res = Math.pow(left,2)+Math.pow(right,2);
            int res = left * left + right * right;
            if (res > c) {
                right--;
            } else if (res < c) {
                left++;
            } else
                return true;
        }
        return false;
    }
}
