package LeetCode_ADailyTopic;

public class Leet_1310 {
    public static void main(String[] args) {

    }

    /*
    有一个正整数数组arr，现给你一个对应的查询数组queries，其中queries[i] = [Li,Ri]。

对于每个查询i，请你计算从Li到Ri的XOR值（即arr[Li] xor arr[Li+1] xor ... xor arr[Ri]）作为本次查询的结果。

并返回一个包含给定查询queries所有结果的数组
    arr = [1,3,4,8],
    queries = [[0,1],[1,2],[0,3],[3,3]]
    XOR = [0, 1, 1^3 ,1^3^4, 1^3^4^8]
           0  1   2     3       4
    1 = 1^3 ^ 0
    2 = 1^3^4 ^ 1
    3 = 1^3^4 ^ 0
     异或掉 左侧值 l = right ^ left-1 和 右侧值 r = len ^ right
     最后 res ^ l ^ r = ans
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length;
        int[] XOR = new int[len + 1];
        XOR[1] = arr[0];
        for (int i = 2; i <= len; i++) {
            arr[i - 1] ^= arr[i - 2];
            XOR[i] = arr[i - 1];
        }
//        System.out.println(Arrays.toString(XOR));
        int len_queries = queries.length;
        int[] ans = new int[len_queries];
        for (int i = 0; i < queries.length; i++) {
            //异或答案
            int left = queries[i][0];
            int right = queries[i][1];
            ans[i] = XOR[right + 1] ^ XOR[left];
        }
        return ans;
    }
}
