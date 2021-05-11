package leetcode_exercise;

public class Leet_1734 {
    public static void main(String[] args) {

    }

    /*
    1^2 = 3
    2^3 = 1
     */
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] prem = new int[n];
        int r = 0;
        for (int i = 0; i < n - 1; i += 2) {
            r ^= encoded[i];
        }
        int l = 0;
        for (int i = 0; i < n; i++) {
            l ^= i;
        }
        System.out.println(r + " " + l);
        int last = r ^ l; //得到最后一位
        prem[n - 1] = last;
        for (int i = n - 2; i >= 0; i--) {
            prem[i] = prem[i + 1] ^ encoded[i];
        }
        return prem;
    }
}
