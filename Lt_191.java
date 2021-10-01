package LeetCode_ADailyTopic;

public class Lt_191 {
    public static void main(String[] args) {
        System.out.println(521);
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n>0) {
            System.out.println(n);
            count += n&1;
            n>>=1;
        }
        return count;
    }
}
