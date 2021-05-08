package leetcode_exercise;

public class Leet_1720 {
    public static void main(String[] args) {

    }

    public int[] decode(int[] encoded, int first) {
        int len = encoded.length + 1;
        int[] ans = new int[len];
        ans[0] = first;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] ^ encoded[i - 1];
        }
        return ans;
    }
}
