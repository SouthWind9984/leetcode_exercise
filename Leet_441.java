public class Leet_441 {

    public int arrangeCoins(int n) {

        /*
            ( 1 + k ) * k / 2 <= n,
            k^2 <= 2n - k
            k^2+k-i>0
         */
        long i = n*2L;
        long k = (long) Math.sqrt(i);
        while (Math.pow(k,k)+k>i)
            k--;
        return (int)k;
    }
}
