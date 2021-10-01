package LeetCode_ADailyTopic;

import LeetCode_ADailyTopic.Lt_104.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leet_94 {
    public static void main(String[] args) {

    }
    ArrayList<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        DFS(root);
        return list;
    }
    public  void DFS(TreeNode root){
        //到底返回
        if(root==null) return;
        //先左节点
        DFS(root.left);
        //进行相应操作
        list.add(root.val);
        //后右节点
        DFS(root.right);
    }
}
