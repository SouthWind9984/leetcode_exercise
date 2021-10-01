package LeetCode_ADailyTopic;

import java.util.ArrayList;

public class Offer45 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根


        int nums [] = {3,30,34,5,9};
		System.out.println(minNumber(nums));
	}

	public static String minNumber(int[] nums) {
		String res = "";
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			String tmp = ""+j;
			int key = Integer.parseInt(""+tmp.charAt(0));
			numberList.add(key, j);
		}
		return res;

    }

    /**
     * @param a
     * @param b
     * @return a+b<b+a
     */
	public static int compare(int a , int b ) {

		return Integer.parseInt(a+""+b)<Integer.parseInt(b+""+a)?Integer.parseInt(a+""+b):Integer.parseInt(b+""+a);

	}

}
