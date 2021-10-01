package LeetCode_ADailyTopic;

public class Leet_1707 {
    public static void main(String[] args) {

    }

    class Node {
        Node[] son = new Node[2];
    }

    Node root = new Node();

    void insert(int x) {
        Node p = root;
        for (int i = 30; i >= 0; i--) {
            int t = (x >> i) & 1;
            if (p.son[t] == null) {
                p.son[t] = new Node();
            }
            p = p.son[t];
        }
    }

    int search(int x, int max) {
        Node p = root;
        int xor = 0;
        for (int i = 30; i >= 0; i--) {
            int t = (x >> i) & 1;
            if (p.son[t ^ 1] != null) {
                xor += (1 << i);
                p = p.son[t ^ 1];
            } else {
                p = p.son[t];
            }
        }
        return xor;
    }

    public int[] maximizeXor(int[] nums, int[][] queries) {
        /*
        queries[i][0]: 待异或的值，与nums[j]异或，返回最大值
        queries[i][1]:nums[j] 不大于该值
         */
        int len = queries.length;
        int[] ans = new int[len];
        //将所有元素插入字典树中
        for (int num : nums) {
            insert(num);
        }
        //找到最高位为一
        for (int i = 0; i < len; i++) {

        }
        return ans;
    }
}
