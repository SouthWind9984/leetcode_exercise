package leetcode_exercise;

public class Leet_91 {
    public static void main(String[] args) {
        String s = "226";
        numDecodings(s);
    }

    public static int numDecodings(String s) {
        /*
        动态规划
这其实是一道字符串类的动态规划题，不难发现对于字符串 s 的某个位置 i 而言，我们只关心「位置 i 自己能否形成独立 item 」和「位置 i 能够与上一位置（i-1）能否形成 item」，而不关心 i-1 之前的位置。

有了以上分析，我们可以从前往后处理字符串 s，使用一个数组记录以字符串 s 的每一位作为结尾的解码方案数。即定义 f[i]f[i] 为考虑前 ii 个字符的解码方案数。

对于字符串 s 的任意位置 i 而言，其存在三种情况：

只能由位置 i 的单独作为一个 item，设为 a，转移的前提是 a 的数值范围为 [1,9][1,9]，转移逻辑为 f[i] = f[i - 1]f[i]=f[i−1]。
只能由位置 i 的与前一位置（i-1）共同作为一个 item，设为 b，转移的前提是 b 的数值范围为 [10,26][10,26]，转移逻辑为 f[i] = f[i - 2]f[i]=f[i−2]。
位置 i 既能作为独立 item 也能与上一位置形成 item，转移逻辑为 f[i] = f[i - 1] + f[i - 2]f[i]=f[i−1]+f[i−2]。
因此，我们有如下转移方程：

\begin{cases} f[i] = f[i - 1], 1 \leqslant a \leq 9 \\ f[i] = f[i - 2], 10 \leqslant b \leqslant 26 \\ f[i] = f[i - 1] + f[i - 2], 1 \leqslant a \leq 9, 10 \leqslant b \leqslant 26 \\ \end{cases}


f[i]=f[i−1],1⩽a≤9
f[i]=f[i−2],10⩽b⩽26
f[i]=f[i−1]+f[i−2],1⩽a≤9,10⩽b⩽26



其他细节：由于题目存在前导零，而前导零属于无效 item。可以进行特判，但个人习惯往字符串头部追加空格作为哨兵，追加空格既可以避免讨论前导零，也能使下标从 1 开始，简化 f[i-1] 等负数下标的判断。

         */
        int len = s.length();
        s = " " + s;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            int a = s.charAt(i) - '0';
            int b = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            // System.out.println(a+" "+b);
            if (a >= 1 && a <= 9) {
                dp[i] = dp[i - 1];
            }
            if (b >= 10 && b <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }
}
