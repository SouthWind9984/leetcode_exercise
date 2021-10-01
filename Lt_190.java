package LeetCode_ADailyTopic;

public class Lt_190 {
    public static void main(String[] args) {

    }
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res<<=-1;
            res+=n&1;
            n>>=1;
        }
        return res;
    }
}
