package leetcode_exercise;


import java.util.LinkedList;

public class Lt_173 {
    public static void main(String[] args) {

    }

      //Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

          TreeNode(int val) {
              this.val = val;
          }

          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }
    class BSTIterator {

        /*
        中序遍历
        左 根 右
        遍历 根 也先左
         */
        private LinkedList<TreeNode> stack = new LinkedList<>();

        public BSTIterator(TreeNode root) {
            pushStack(root);
        }

        private void pushStack(TreeNode root) {
            do {
                stack.addLast(root);
                root = root.left;
            } while (root != null);
        }

        public int next() {
            // if(stack.isEmpty()) return -1;
            int returnVal = stack.peekLast().val;
            TreeNode rightSubTree = stack.pollLast().right;
            if (rightSubTree != null) pushStack(rightSubTree);
            return returnVal;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
