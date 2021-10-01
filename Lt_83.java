package LeetCode_ADailyTopic;

public class Lt_83 {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode last = deleteDuplicates(head.next);
        if(last!=null&&last.val==head.val){
            head.next = last.next;
        }
        return last;
    }


}
