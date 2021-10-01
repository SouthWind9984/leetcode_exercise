package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_1356 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {1000,1000};
			arr=sortByBits(arr);
			for (int i = 0; i < arr.length; i++) {
				int j = arr[i];
				System.out.println(j);
			}
	}


    public static int[] sortByBits(int[] arr) {
		int [] res = new int [arr.length];
		for (int i = 0; i < arr.length; i++) {

            int n =arr[i];
			res[i] = Integer.bitCount(n)*10000+n;
		}
	Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			res[i]%=10000;
		}
		return res;
    }

}
