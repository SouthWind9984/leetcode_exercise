package leetcode_exercise;

public class Leet_877 {
    public static void main(String[] args) {

    }

    /*
    亚历克斯先开始取石头
      每次取最多的
    进行模拟拿石头
    每次取走最多
     */
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int A = 0;
        int L = 0;
        boolean flag = true;
        for (int i = 0, r = len - 1; i < r; ) {
            int max = 0;
            if (piles[i] >= piles[r]) {
                max = piles[i];
                i++;
            } else {
                max = piles[r];
                r--;
            }
            if (flag) {
                A += max;
                flag = false;
            } else {
                L += max;
                flag = true;
            }
        }

        return true;
    }
}
