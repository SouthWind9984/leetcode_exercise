package leetcode_exercise;

import leetcode_exercise.Lt_173.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet_993 {
    public static void main(String[] args) {

    }

    private List<List<Integer>> list = new ArrayList<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        DFS(root, null, 0, x);
        DFS(root, null, 0, y);
        System.out.println(list);
        return list.get(1).get(0).equals(list.get(0).get(0)) && !list.get(1).get(1).equals(list.get(0).get(1));
    }

    //当前节点 父节点 深度 ,目标值
    public void DFS(TreeNode root, TreeNode father, int depth, int targer) {
        if (root == null)
            return;
        //相应的操作
        if (root.val == targer) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(depth); //深度
            if (father == null)
                list1.add(0);//父节点
            else list1.add(father.val);
            list.add(list1);
        }
        DFS(root.left, root, depth + 1, targer);
        DFS(root.right, root, depth + 1, targer);
    }

    public void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
