package LeetCode_ADailyTopic;

public class Lt_896 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {6,5,4,2,1};
		System.out.println(isMonotonic(arr));
	}

    public static boolean isMonotonic(int[] A) {
		boolean f1 = false;
		boolean f2 = false;
		for (int i = 1; i < A.length; i++) {
			if(A[i]-A[i-1]<0) {  //递减
				f1=true;
			}
			else if(A[i]-A[i-1]>0){	//递增
				f2=true;
			}
			if(f1&&f2) {
				return false;
			}
		}
		return true;
    }

}
