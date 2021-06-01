package leetcode_exercise;

public class Leet_1744 {
    public static void main(String[] args) {


    }

    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int len = queries.length;
        boolean[] ans = new boolean[len];
        //前缀和
        long[] sum = new long[candiesCount.length];
        sum[0] = candiesCount[0];
        for (int i = 1; i < candiesCount.length; i++) {
            sum[i] = sum[i - 1] + candiesCount[i];
        }
        for (int i = 0; i < len; i++) {
            int[] query = queries[i];
            //区间一
            long min = query[1] + 1; //每天吃一个，最少的数量

            long max = (long) (query[1] + 1) * query[2]; //每天吃最多的数量

            long min1 = query[0] == 1 ? 0 : sum[query[0] - 1] + 1;//吃该类型的糖 所需吃最少的数量

            long max1 = sum[query[0]];//吃该类型的糖 能吃最多的数量

            ans[i] = !(min > max1 || max < min1);

        }
        return ans;
    }
}
