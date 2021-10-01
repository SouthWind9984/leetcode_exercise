package LeetCode_ADailyTopic;

public class Lt_121 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices.length==0)
			return 0;
		int max = 0;
		int min = (int) Math.pow(10, 4);
		for (int i = 0; i < prices.length; i++) {
			int m = prices[i];
			if(m<min)
				min = m;
			max = Math.max(max, m-min);
		}
		return max;
    }

}
