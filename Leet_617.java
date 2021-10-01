package LeetCode_ADailyTopic;

import LeetCode_ADailyTopic.Lt_104.TreeNode;

public class Leet_617 {
    public static void main(String[] args) {

    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null&&root2==null)
            return null;
        else if(root1 == null){
            root1.val= root2.val;
        }
        else if(root2 == null){
            root1.val= root1.val;
        }
        else{
            root1.val = root1.val+root2.val;
        }
        mergeTrees(root1.left,root2.left);
        mergeTrees(root1.right,root2.right);
        return root1;
    }
}
