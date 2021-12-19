package LeetCode_ADailyTopic;

import java.util.*;

/**
 * @author SouthWind
 * @date 2021/12/15
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_851 {
    public static void main(String[] args) {

    }

    /**
     * richer[0][0] 比 richer[0][1] 有钱
     * quiet[i] person[i] 的安静值
     * 深度查找
     *
     * @param richer
     * @param quiet
     * @return
     */
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int len = quiet.length;
        int[] ansArr = new int[len];
        // 比第i个人有钱的人
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] ints : richer) {
            int personA = ints[0];
            int personB = ints[1];
            //personA > personB , 存储比personB有钱的人
            if (map.containsKey(personB)) {
                List<Integer> list = map.get(personB);
                list.add(personA);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(personA);
                map.put(personB, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<List<Integer>> tmp = new ArrayList<>();
            List<Integer> value = entry.getValue();
            for (Integer per : value) {
                if (map.containsKey(per)) {
                    tmp.add(map.get(per));
                }
            }
            List<Integer> tmp1 = entry.getValue();
            for (List<Integer> list : tmp) {
                tmp1.addAll(list);
            }
            map.put(entry.getKey(), tmp1);
        }
        System.out.println(map);
        return ansArr;
    }

    class Solution {
        public int[] loudAndRich(int[][] richer, int[] quiet) {
            // 拓扑排序：取入度为0的先入队，减少它下游节点的入度，如果为0了也入队，直到队列中没有元素为止

            int n = quiet.length;

            // 先整理入度表和邻接表
            int[] inDegree = new int[n];

            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }

            for (int[] r : richer) {
                inDegree[r[1]]++;
                g[r[0]].add(r[1]);
            }

            // 初始化ans各位为自己
            // 题目说的是：在所有拥有的钱肯定不少于 person x 的人中，person y 是最安静的人
            // 注意这里的不少于，说明可以是自己
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = i;
            }

            // 拓扑排序开始
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            while (!queue.isEmpty()) {
                int p = queue.poll();
                // q是p的下游，也就是p比q有钱
                for (int q : g[p]) {
                    // 如果p的安静值比q小，更新p的安静值对应的那个人
                    // 注意这里p的安静值，并不是原始的quiet数组中的quiet[p]
                    // 而是已经更新后的安静值，所以，应该取quiet[ans[p]]
                    // 这里没有改变原来数组的内容，而是通过ans[p]间接引用的，细细品一下
                    // 想像一下上图中的3的安静值被更新成了5的1
                    if (quiet[ans[p]] < quiet[ans[q]]) {
                        ans[q] = ans[p];
                    }

                    if (--inDegree[q] == 0) {
                        queue.offer(q);
                    }
                }
            }

            return ans;
        }
    }

}
