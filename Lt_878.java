package LeetCode_ADailyTopic;

import java.util.TreeMap;

public class Lt_878 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		nthMagicalNumber(4,2,3);
	}

    public static int nthMagicalNumber(int n, int a, int b) {

        Long res = 0L;
		TreeMap<Long,Integer> map = new TreeMap<>();
		for (int i = 1; i <= n; i++) {
			map.put((long) a * i,0);
			map.put((long) b * i,0);
		}
//		System.out.println(map);
		int count = 1;
		for (Long aLong : map.keySet()) {
			if (count==n){
				res=aLong;
			}
			count++;
		}

		System.out.println(res);
		return (int) (res%(10e9+7));
	}

}
