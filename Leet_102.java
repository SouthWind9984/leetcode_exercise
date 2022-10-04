package LeetCode_ADailyTopic;

import LeetCode_ADailyTopic.Lt_173.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet_102 {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
//        BFS(root);
        list.add(new ArrayList<>());
        DFS(root, 0);
        System.out.println(list);
        return list;
    }

    public void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list1 = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list1.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(list1);
        }
    }

    public void DFS(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        //给下一层备用
        if (level >= list.size()) {
            list.add(new ArrayList<>());
        }
        //加入该层节点
        list.get(level).add(root.val);
        DFS(root.left, level + 1);
        DFS(root.right, level + 1);
    }
}
