package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Lt_1742 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(countBalls(5, 15));
//		System.out.println(2/10);
	}
	public static int countBalls(int lowLimit, int highLimit) {

        int res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = lowLimit; i <=highLimit ; i++) {
			int tmp = i;
			int sum = 0;
			while(tmp>0) {
				sum+=tmp%10;
				tmp/=10;
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
			res = Math.max(res, map.get(sum));
		}
		return res;
    }

}
