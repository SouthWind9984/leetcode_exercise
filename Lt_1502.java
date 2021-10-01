package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_1502 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] arr = {3,5,1};
		System.out.println(canMakeArithmeticProgression(arr));
	}

	public static boolean canMakeArithmeticProgression(int[] arr) {


        Arrays.sort(arr);

        for (int i = 0; i < arr.length-2; i++) {
			if(arr[i+1]-arr[i]!=arr[i+2]-arr[i+1])
				return false;
		}
		return true;

    }

}
