package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/6 9:10
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */


public class Leet_876 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    //双指针，一快一慢
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode last = head;
        while (fast != null && fast.next != null) {
            //快指针走两步，慢指针走一步
            fast = fast.next.next;
            last = last.next;
        }
        return last;
    }

    // 双遍历，一次求链表长度，一次找中间节点
    public ListNode middleNode1(ListNode head) {
        int size = 0;
        ListNode tmp = null;
        tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            size++;
        }
        int mid = size / 2 + 1;
        while (mid > 0 && head != null) {
            head = head.next;
            mid--;
        }
        return head;
    }
}
