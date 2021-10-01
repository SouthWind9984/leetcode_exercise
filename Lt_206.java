package LeetCode_ADailyTopic;

public class Lt_206 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {1,2,3,4,5};
		ListNode firstNode = null , lastNode = null, newNode;
		for (int i = 0; i < arr.length; i++) {
			newNode = new ListNode(arr[i]);
			newNode.next=null;
			if(firstNode==null){
                firstNode=newNode;
                lastNode=newNode;
            }
            else{
                lastNode.next=newNode;
                lastNode=newNode;
            }
		}
		System.out.println(reverseList(firstNode));

	}
	//Definition for singly-linked list.


    public static ListNode reverseList(ListNode head) {
		ListNode lastnode =head , firstnode = null;
		while(lastnode!=null) {
			ListNode next = lastnode.next;
			lastnode.next = firstnode;
			firstnode =lastnode;
            lastnode = next;
        }
        return firstnode;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
