package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/7
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        StringBuilder strBuilder = new StringBuilder();
        while (head.next != null) {
            strBuilder.append(head.val);
            head = head.next;
        }
        strBuilder.append(head.val);
        String res = strBuilder.toString();
        StringBuilder reverse = strBuilder.reverse();
        return res.equals(reverse.toString());
    }

}
