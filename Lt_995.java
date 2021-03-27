package leetcode_exercise;

import java.util.Deque;
import java.util.LinkedList;

public class Lt_995 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	
	public static int minKBitFlips(int[] A, int K) {
		Deque<Integer> que = new LinkedList<Integer>();
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			if(que.size()>0&&i>que.peek() + K -1) {
				que.removeFirst();
			}
			if(que.size()%2==A[i]) {
				que.add(i);
				res++;
			}
			if(que.size()+K>A.length)
				return -1;
		}
		
		return res;

    }

}
