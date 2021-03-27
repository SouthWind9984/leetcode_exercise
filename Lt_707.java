package leetcode_exercise;

public class Lt_707 {

    class MyLinkedList {

        private ListNode linked = null;
        /** Initialize your data structure here. */
        public MyLinkedList() {

        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            ListNode node = linked;
            while(node!=null){
                System.out.println(node.val);
                node=node.next;
            }
            return index;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode head = new ListNode(val);
            head.next = linked;
            linked = head;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode node = linked;
            while(node.next!=null){
                node = node.next;
            }
            ListNode tail = new ListNode(val);
            node.next = tail;
            tail.next = linked;
            tail.next = null;
            linked = tail;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

        }
        public int linkedLength(ListNode head){
            int count = 1;
            while (head.next!=null){
                count++;
                head = head.next;
            }
            return count;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

}
