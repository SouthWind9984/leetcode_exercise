package LeetCode_ADailyTopic;

public class Lt_92 {

    public static void main(String[] args) {
        ListNode hard = new ListNode(0);
        ListNode next = null;
        next = hard; //头连接
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            next.next = node;//连接新节点
            next = node;//下节点往后移动
        }
//        reverseBetween(hard,3,5);
        hard = reverse(hard);
        ListNode node = hard;
        while (hard!=null){
            System.out.print(hard.val+"  ");
             hard = hard.next;
        }
        System.out.println();
        ListNode Node1 = null;
//        Node1 = reverse(node,7);
//        while (Node1!=null){
//            System.out.print(Node1.val+"  ");
//            Node1 = Node1.next;
//        }
        ListNode Node2 = null;
        Node2 = reverseBetween(node,2,5);
        while (Node2!=null){
            System.out.print(Node2.val+"  ");
            Node2 = Node2.next;
        }
    }

    //反转整个链表
    private static ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    static ListNode huoqu = null;
    //反转前n个节点的链表
    private static ListNode reverse(ListNode head,int n){
        if(n==1){
            huoqu = head.next ;  //记录下后驱节点
            return  head;
        }
        ListNode last = reverse(head.next,n-1);  //反转前n个接节点
        head.next.next = head;
        head.next = huoqu;
        return last;
    }
    //反转n-m个节点的链表
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1){
           return reverse(head,right);
        }
        head.next = reverseBetween(head.next,left-1,right-1);
        return head;
    }
}
