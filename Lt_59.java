package LeetCode_ADailyTopic;

public class Lt_59 {
    public static void main(String[] args) {
        int [][] arr = generateMatrix(5);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int row = n-1;
        int col = n-1;
        int count = 1;
        int r = 0;  //行
        int c = 0;  //列
        int k = 0;
        int [][] res = new int[n][n];
        while(count<=(n*n)){
            while(c<col){
                if(count>n*n) break;
                res[r][c++]=count++;
            }
            do {
                if(count>n*n) break;
                res[r++][c]=count++;
            }while(r<row);
            while(c>k){
                if(count>n*n) break;
                res[r][c--]=count++;
            }
            while(r>k+1){
                if(count>n*n) break;
                res[r--][c]=count++;
            }
            row--;
            col--;
            k++;
        }
        return res;
    }
}
