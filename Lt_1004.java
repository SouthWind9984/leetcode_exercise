package leetcode_exercise;

public class Lt_1004 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		System.out.println(longestOnes(arr, 3));
	}
	/**
	 *	 滑动窗口解法
	 *右指针主动向前移动，左指针被动向前移，左右之间距离构成窗口
	 * @param A
	 * @param K
	 * @return
	 */
	
	public static int longestOnes(int[] A, int K) {
		
		int length = A.length;
		int right =0 ;
		int left = 0 ;
		int zeros = 0;
		while(right<length) {
			if(A[right++]==0) {
				zeros++;
			}
			if(zeros>K) {
				if(A[left++]==0) {
					zeros--;
				}
			}
		}
		return right-left;

    }

}
