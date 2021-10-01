package LeetCode_ADailyTopic;

import java.util.Arrays;
import java.util.Comparator;

public class Lt_354 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] arr = {{5,4},{6,7},{6,4},{2,3}};
		System.out.println(maxEnvelopes(arr));
	}
	public static int maxEnvelopes(int[][] arr) {
		int res = 0;
		Arrays.sort(arr, new Comparator<int []>() {
			@Override
			public int compare(int[] c1, int[] c2) {
				// TODO 自动生成的方法存根
				if(c1[0]!=c2[0]) {
					return c1[0]-c2[0];
				}
				else

				return c2[1]-c1[1];
			}
		});
		for (int i = 0; i < arr.length; i++) {
			int[] js = arr[i];
			for (int j = 0; j < js.length; j++) {
				int n = js[j];
				System.out.print(n+"  ");
			}
			System.out.println();
		}


        int len = arr.length;
		int [] dp = new int [len];
		for (int i = 0; i < dp.length; i++) {
			int j = dp[i];
			System.out.print(j+" ");
		}
		System.out.println();
		for(int i = 0  ; i < len ; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[j][1]<arr[i][1]) {
					dp[i] =Math.max(dp[j]+1, dp[i]);
					res = Math.max(res, dp[i]);
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			int j = dp[i];
			System.out.print(j+" ");
		}
		return res;
    }

}
