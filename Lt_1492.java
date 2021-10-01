package LeetCode_ADailyTopic;

import java.util.ArrayList;

public class Lt_1492 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(kthFactor(12, 3));
		System.out.println(kthFactor(7, 2));
		System.out.println(kthFactor(4, 4));
		System.out.println(kthFactor(1, 1));
		System.out.println(kthFactor(1000, 3));
	}

	public static int kthFactor(int n, int k) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				nums.add(i);
			}
		}
		int number=0;
		if(k<=nums.size()) {
			number=nums.get(k-1);
		}
		else
			number=-1;
		return number;
	}
}
