package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Lt_1491 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根


        int [] nums = {4000,3000,1000,2000};
		double n= average(nums);
		System.out.println(n);
	}

    public static double average(int[] salary) {
		Arrays.sort(salary);
		salary[0]=0;
		salary[salary.length-1]=0;
		double sum=0;
		for(int t:salary) {
			sum+=t;
		}
		return sum/(salary.length-2);
    }

}
