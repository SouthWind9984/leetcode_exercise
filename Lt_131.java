package leetcode_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lt_131 {
    public static void main(String[] args) {
        String s = "aab";
        Solution.partition(s);
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                
            }
        }
        return null;
    }
    static class Solution {

        public static List<List<String>> partition(String s) {
            int n = s.length();
            char[] cs = s.toCharArray();
            // f[i][j] 代表 [i, j] 这一段是否为回文串
            boolean[][] f = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int i = j; i >= 0; i--) {
                    // 当 [i, j] 只有一个字符时，必然是回文串
                    if (i == j) {
                        f[i][j] = true;
                    } else {
                        // 当 [i, j] 长度为 2 时，满足 cs[i] == cs[j] 即回文串
                        if (j - i + 1 == 2) {
                            f[i][j] = cs[i] == cs[j];

                            // 当 [i, j] 长度大于 2 时，满足 (cs[i] == cs[j] && f[i + 1][j - 1]) 即回文串
                        } else {
                            f[i][j] = cs[i] == cs[j] && f[i + 1][j - 1];
                        }
                    }
                }
            }
            List<List<String>> ans = new ArrayList<>();
            List<String> cur = new ArrayList<>();
            dfs(s, 0, ans, cur, f);
            return ans;
        }
        /**
         * s: 要搜索的字符串
         * u: 以 s 中的那一位作为回文串分割起点
         * ans: 最终结果集
         * cur: 当前结果集
         * f: 快速判断 [i,j] 是否为回文串
         */
        static void dfs(String s, int u, List<List<String>> ans, List<String> cur, boolean[][] f) {
            int n = s.length();
            if (u == n) ans.add(new ArrayList<>(cur));
            for (int i = u; i < n; i++) {
                if (f[u][i]) {
                    cur.add(s.substring(u, i + 1));
                    dfs(s, i + 1, ans, cur, f);
                    cur.remove(cur.size() - 1);
                }
            }
        }
    }

}
