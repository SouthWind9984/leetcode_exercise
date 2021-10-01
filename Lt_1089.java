package LeetCode_ADailyTopic;

public class Lt_1089 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] arr = {1,0,2,0,3,0,4,5,0};
		duplicateZeros(arr);
	}
	public static void duplicateZeros(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			int j = arr[i];
			if(j==0) {
				for(int k=arr.length-1;k>i+1;k--) {
					arr[k]=arr[k-1];
				}
				arr[i+1]=0;
				i++;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}


    }

}
