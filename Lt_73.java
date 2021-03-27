package leetcode_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Lt_73 {
    public static void main(String[] args) {
        int[][] matrix= {{1,1,1},
                         {1,0,1},
                         {1,1,1}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        Map<Integer,Integer> row_map = new HashMap<>();
        Map<Integer,Integer> col_map = new HashMap<>();
        int row_len =matrix.length;
        int col_len =matrix[0].length;
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len ; j++) {
                if(matrix[i][j]==0){
                    row_map.put(i,0);
                    col_map.put(j,0);
                }
            }
        }
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                if (row_map.containsKey(i)||col_map.containsKey(j)){
                    matrix[i][j]=0;
                }
            }
        }
        //打印数组
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len ; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
