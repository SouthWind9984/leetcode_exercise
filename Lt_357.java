package LeetCode_ADailyTopic;

public class Lt_357 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

        System.out.println(countNumbersWithUniqueDigits(3));
	}
	public static int countNumbersWithUniqueDigits(int n) {
		int res = 9;
		if(n==0) return 1;
		else if(n==1) return 10;
		else {
			for(int i=n;i>1;i--) {
				res*=(11-i);
			}
		}
		return res+= countNumbersWithUniqueDigits(n-1);
    }

}
