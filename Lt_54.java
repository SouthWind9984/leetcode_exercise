package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

public class Lt_54 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));

    }
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0)
			return list;
		int m = matrix.length;
		int n = matrix[0].length;
		int i = 0;

		//统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
		int count = (Math.min(m, n)+1)/2;
		//从外部向内部遍历，逐层打印数据
		while(i < count) {
			for (int j = i; j < n-i; j++) {
				list.add(matrix[i][j]);
			}
			for (int j = i+1; j < m-i; j++) {
				list.add(matrix[j][(n-1)-i]);
			}

			for (int j = (n-1)-(i+1); j >= i && (m-1-i != i); j--) {
				list.add(matrix[(m-1)-i][j]);
			}
			for (int j = (m-1)-(i+1); j >= i+1 && (n-1-i) != i; j--) {
				list.add(matrix[j][i]);
			}
			i++;
		}
		return list;
	}

}
