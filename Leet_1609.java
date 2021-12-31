package LeetCode_ADailyTopic;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author SouthWind
 * @date 2021/12/25
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1609 {

    public static void main(String[] args) {

    }

    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> quene = new LinkedList<>();
        quene.offer(root);
        boolean leftToRight = true;
        while (!quene.isEmpty()) {
            int size = quene.size();
            int temp = quene.get(0).val;
            for (int i = 0; i < size; i++) {
                TreeNode node = quene.poll();
                //左 - 右   递增   奇数
                //右 - 左   递增   偶数
                if (leftToRight) {
                    if ((i > 0 && Objects.requireNonNull(node).val <= temp) || ((node.val & 1) != 1)) {
                        return false;
                    }
                } else {
                    if ((i > 0 && Objects.requireNonNull(node).val >= temp) || ((node.val & 1) != 0)) {
                        return false;
                    }
                }
                if (Objects.nonNull(node.left)) {
                    quene.offer(node.left);
                }
                if (Objects.nonNull(node.right)) {
                    quene.offer(node.right);
                }
                //赋下一个值
                temp = node.val;
            }
            // 更换奇偶
            leftToRight = !leftToRight;

        }
        return true;
    }

}
