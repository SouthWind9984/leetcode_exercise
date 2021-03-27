package leetcode_exercise;

public class Lt_61 {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;

        ListNode node1 = head;
        while(node1!=null){
            count++;
            node1=node1.next;
        }
        k = k%count;
        if(k==0)
            return head;
        System.out.println(count+" "+k);
        //快慢指针,都指向头部
        ListNode fast = head;
        ListNode slow = head;
        //快指针先走k步
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        //快慢指针在一起走到链表尾部
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //首尾相连
        fast.next=head;
        //头指针指向，慢指针的下一个节点
        head = slow.next;
        //链表断开
        slow.next=null;
        return head;
    }
}
