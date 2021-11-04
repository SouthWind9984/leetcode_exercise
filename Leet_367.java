public class Leet_367 {
    public static void main(String[] args) {

    }

    /*
    1 + 3 + 5 + (2*n-1)  = n^2 --> 前n项奇数之和
     */
    public boolean isPerfectSquare(int num) {
        int num1 = 1;
        while(num > 0)
        {
            num -= num1;
            num1 += 2;
        }
        return num == 0;
    }

    public boolean dichotomy(int num){
        int l = 1;
        int r = num;
        while (l<r){
            int mid = l + (r - l)/2;
            int tmp = num / mid;
            if (tmp<=mid){
                if (num==tmp && num%mid==0) return true;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }
}
