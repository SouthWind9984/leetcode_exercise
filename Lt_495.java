package leetcode_exercise;

public class Lt_495 {

	/**
	 * 	在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。现在，给出提莫对艾希的攻击时间序列和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。

		你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。

	示例1:

		输入: [1,4], 2
		输出: 4
		原因: 第 1 秒初，提莫开始对艾希进行攻击并使其立即中毒。中毒状态会维持 2 秒钟，直到第 2 秒末结束。
		第 4 秒初，提莫再次攻击艾希，使得艾希获得另外 2 秒中毒时间。
		所以最终输出 4 秒。

	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int arr[] = {};
		int n = findPoisonedDuration(arr, 1);
		System.out.println(n);
		
	}
	
	 public static int findPoisonedDuration(int[] timeSeries, int duration) {
		 int t=0;
			if(timeSeries.length==0||duration==0) 
	            return 0;
	        if(timeSeries.length==1)
	            return duration;
			    for(int i=0;i<timeSeries.length-1;i++){
				 if(timeSeries[i+1]-timeSeries[i]>=duration) {
					 t=t+duration;
				 }
				 if(timeSeries[i+1]-timeSeries[i]<duration) {
					 t=t+timeSeries[i+1]-timeSeries[i];
				 }
			 }
			 return t+duration;
	 }

}
