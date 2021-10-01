package LeetCode_ADailyTopic;

public class Lt_832 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] A = {{1,1,0},{1,0,1},{0,0,0}};
		A = flipAndInvertImage(A);
		for (int i = 0; i < A.length; i++) {
			int[] js = A[i];

            for (int j = 0; j < js.length; j++) {
				int k = js[j];
				System.out.print(k+"  ");
			}
			System.out.println();
		}
	}

    public static int[][] flipAndInvertImage(int[][] A) {

        int col = A[0].length;
		boolean f = col%2!=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < col/2; j++) {
				A[i][j]^=A[i][col-1-j];
				A[i][col-1-j]=A[i][j]^A[i][col-1-j]^1;
				A[i][j]^=A[i][col-1-j];

            }
			if(f) {
				A[i][col/2]^=1;
			}
		}
		return A;
    }

}
