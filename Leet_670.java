package LeetCode_ADailyTopic;

import java.util.Vector;

/**
 * @author SouthWind
 * @date 2022/9/13
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_670 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.maximumSwap1(2736));
    }


    static class Solution {

        public int maximumSwap(int num) {
            int res;
            char[] chars = String.valueOf(num).toCharArray();
            int[] maxNumIndexArr = new int[chars.length];
            int max = chars.length - 1;
            //从右遍历找最大元素
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] - '0' > chars[max] - '0') {
                    max = i;
                }
                maxNumIndexArr[i] = max;
            }
            //System.out.println(Arrays.toString(maxNumIndexArr));
            //找第一个小于最大元素的数，将位置进行调换
            for (int i = 0; i < chars.length; i++) {
                char n = chars[i];
                char m = chars[maxNumIndexArr[i]];
                if (n != m) {
                    chars[i] = m;
                    chars[maxNumIndexArr[i]] = n;
                    break;
                }
            }
            res = Integer.parseInt(String.valueOf(chars));
            return res;
        }


        public int maximumSwap1(int num) {
            Vector<Integer> vector = new Vector<>();
            int tmp = num;
            int len = 0;
            while (tmp > 0) {
                vector.add(0, tmp % 10);
                tmp /= 10;
                len++;
            }
            boolean flag = false;
            int[] swap = new int[2];
            for (int i = 0; i < len - 1; i++) {
                int n = vector.get(i);
                for (int j = i + 1; j < len; j++) {
                    int m = vector.get(j);
                    if (m > n) {
                        //跳过swap[1]=0,与小标零的比较
                        if (!flag) {
                            flag = true;
                            swap[1] = j;
                        } else if (m >= vector.get(swap[1])) {
                            swap[1] = j;
                        }
                    }
                }
                if (flag) {
                    swap[0] = i;
                    break;
                }
            }
            if (flag) {
                int n = vector.get(swap[0]);
                int m = vector.get(swap[1]);
                vector.remove(swap[0]);
                vector.add(swap[0], m);
                vector.remove(swap[1]);
                vector.add(swap[1], n);
            }

            int res = 0;
            for (Integer integer : vector) {
                res = res * 10 + integer;
            }
            return res;
        }
    }
}
