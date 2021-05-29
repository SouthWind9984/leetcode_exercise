package leetcode_exercise;

import java.util.HashMap;

public class Leet_1074 {

    public static void main(String[] args) {

    }

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = i; j < col; j++) {
                int sum = 0;
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                for (int k = 0; k < row; k++) {
                    sum += (i == 0 ? matrix[k][j] : matrix[k][j] - matrix[k][i - 1]);
                    int n = sum - target;
                    if (map.containsKey(n)) {
                        res += map.get(n);
                    }
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
                System.out.println(map);
            }
        }
        return res;
    }

}
