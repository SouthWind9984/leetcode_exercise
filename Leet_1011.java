package LeetCode_ADailyTopic;

public class Leet_1011 {
    public static void main(String[] args) {

        int[] wights = {3, 2, 2, 4, 1, 4};
        shipWithinDays(wights, 5);
    }

    public static int shipWithinDays(int[] weights, int D) {
        int len = weights.length;
        int sum = 0;
        int max = -1;
        /*
        最低运载能力在 max  --  sum 之间
         */
        for (int i = 0; i < len; i++) {
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
//        System.out.println("sum = " + sum);
//        System.out.println("max = " + max);
        //二分查找
        int left = max;
        int right = sum;
        int min = 0;
        while (left < right) {
            min = (left + right) / 2;
            //通过，则减重
            if (check(weights, D, min)) {
                right = min - 1;
            }
            //否则加重
            else {
                left = min + 1;
            }
        }
//        System.out.println("min = " + min);
        return min;
    }

    //运载能力H
    public static boolean check(int[] wights, int D, int H) {
        //所需天数
        int count = 1;
        //每天运载货物的重量
        int sum = 0;
        for (int i = 0; i < wights.length; i++) {
            sum += wights[i];
            if (sum > H) {
                count++;
                sum = wights[i];
            }
            if (count > D)
                return false;
        }
        return true;
    }

}
