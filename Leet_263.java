package leetcode_exercise;

public class Leet_263 {
    /*
      丑数是只包含质因数2，3，5的正整数
     */
    public static void main(String[] args) {
        int [] chou = {2,3,5};
    }

    public boolean isUgly(int n) {
        while(n!=0&&(n%5==0||n%3==0||n%2==0)){
            if (n%5==0){
                n/=5;
            }
            else if(n%3==0)
                n/=3;
            else
                n/=2;
        }
        return n==1;
    }
}
