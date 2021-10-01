package LeetCode_ADailyTopic;

public class Lt_1450 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] startTime = {1,1,1,1};
		int [] endTime = {1,3,2,4};
		int queryTime = 5;
		System.out.println(busyStudent(startTime, endTime, queryTime));
	}
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int sum=0;
		for (int i = 0; i < startTime.length; i++) {
			if(startTime[i]<=queryTime&&endTime[i]>=queryTime) {
				sum++;
			}
		}
		return sum;

    }

}
