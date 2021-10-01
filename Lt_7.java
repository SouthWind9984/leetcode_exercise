package LeetCode_ADailyTopic;

public class Lt_7 {

	 public static int reverse(int x) {
		long n=0;
		 if(x>0) {

             while (x > 0) {
                 n = n * 10 + x % 10;
                 x /= 10;

             }
             if (n > 2147483647)
                 return 0;
             else
                 return (int) n;
         }
		 else {
             x = Math.abs(x);

             while (x > 0) {
                 n = n * 10 + x % 10;
                 x /= 10;
             }
             if (n > 2147483647)
                 return 0;
             else
                 return (int) -n;
         }

     }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(reverse(-2147483641));
	}

}
