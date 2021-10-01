package LeetCode_ADailyTopic;

public class Lt_1052 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] customers = {1,0,1,2,1,1,7,5},grumpy = {0,1,0,1,0,1,0,1};
		System.out.println(maxSatisfied(customers, grumpy, 4));
	}

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {

        //1为生气，0为生气
		int len = customers.length;
		int sum = 0;
		for (int i = 0; i < len ; i++) {
			if(grumpy[i]==0)
				sum += customers[i];
		}
		int max= 0;
		for(int i = 0 ,j = 0; i<len;i++) {
			if(i-j==X-1) {
				int tmp=0;
				for (int k = j; k <=i; k++) {
					if(grumpy[k]==1) {
						tmp+=customers[k];
					}
				}
				max = Math.max(max,tmp);
				j++;
			}
		}
		return sum+max;

    }

}
