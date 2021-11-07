package LeetCode_ADailyTopic;


/**
 * @author SouthWind
 */
public class Leet_598 {

    /**
     * 矩阵模拟
     * 记录所走的区间之和
     *
     * @param m
     * @param n
     * @param ops
     * @return
     */
    public int maxCount(int m, int n, int[][] ops) {
        // 0ms
        for (int[] op : ops) {
            m = Math.min(op[0], m);
            n = Math.min(op[1], n);
        }
        return m * n;

        // 1ms
//        if (ops.length==0) return m*n;
//        int[] ints = Arrays.stream(ops).reduce((x, y) -> new int[]{Math.min(x[0], y[0]), Math.min(x[1], y[1])}).get();
//        return ints[0]*ints[1];

        // 3ms
//        return (ops.length == 0) ? (m * n) : (Arrays.stream(ops).min(Comparator.comparingInt(o -> o[0])).get()[0] * Arrays.stream(ops).min(Comparator.comparingInt(o -> o[1])).get()[1]);

        //2 ms
//        return ops.length == 0 ? (m * n) :Arrays.stream(Arrays.stream(ops).reduce((x, y) -> new int[]{Math.min(x[0], y[0]),Math.min(x[1], y[1])}).get()).reduce((a,b)->a * b).getAsInt();


    }
}
