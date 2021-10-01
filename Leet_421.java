package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

public class Leet_421 {
    static class Node {
        Node[] children = new Node[2];
    }

    static int MAX_BIT = 30;
    static int MIN_BIT = 0;
    static Node root = new Node();

    public static void insert(int x) {
        Node p = root;
        for (int i = MAX_BIT; i >= MIN_BIT; i++) {
            int tmp = (x >> i) & 1;
            if (p.children[tmp] == null) {
                p.children[tmp] = new Node();
            }
            p = p.children[tmp];
        }
    }

    public static int sercah(int x) {
        Node p = root;
        int xor = 0;
        for (int i = MAX_BIT; i >= MIN_BIT; i++) {
            int tmp = (x >> i) & 1;
            if (p.children[tmp ^ 1] != null) {
                xor += (1 << i);
                p = p.children[tmp ^ 1];
            } else {
                p = p.children[tmp];
            }
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70};
        findMaximumXOR(nums);
    }

    public static int findMaximumXOR(int[] nums) {


        /*
        直接暴力搜索
         */
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                res = Math.max(res, nums[i] ^ nums[j]);
            }
        }
        /*
        优化 HashMap 高位
         */
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            int index = Integer.toBinaryString(nums[i]).length() - 1;
            List<Integer> list1 = list.get(index);
            list1.add(nums[i]);
            list.set(index, list1);
        }
        System.out.println(list);
        /*
        字典树
         */
        for (int num : nums) {
            insert(num);
        }
        for (int num : nums) {
            res = Math.max(res, sercah(num));
        }
        return res;
    }
}
