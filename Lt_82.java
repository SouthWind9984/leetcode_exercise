package leetcode_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lt_82 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode next = null;
        next =head ;
        for (int i = 1; i < 10; i++) {
            ListNode newNode = new ListNode(i);
            next.next = newNode;  //连接新节点
            next = newNode;   //指针移动到下一节点
        }
        ListNode newNode = new ListNode(9);
        next.next = newNode;  //连接新节点
        next = newNode;   //指针移动到下一节点
//        while(head!=null){
//            System.out.println(head.val);
//            head=head.next;
//        }
        deleteDuplicates(head);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode next = head;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(next!=null){
            map.put(next.val,map.getOrDefault(next.val,0)+1);
            next =next.next;
        }
        ListNode lastNode = null;
        ListNode nextNode = null;
        int count=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1&&count==0){
                 lastNode = new ListNode(entry.getKey());
                 nextNode = lastNode;
                count++;
            }
            else if (entry.getValue()==1&&count==1){
                ListNode newNode = new ListNode(entry.getKey());
                nextNode.next = newNode;
                nextNode=newNode;
            }
        }
        return lastNode;
    }
}
