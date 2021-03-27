package leetcode_exercise;

public class Lt_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode hard1 = new ListNode(0),next = null; //创建一个头节点
		next = hard1;   //下一个节点和头相连 ，开始为首尾相连
		for (int i = 1; i < 20; i++) {
			ListNode newNode = new ListNode(i); //创建新的节点
			next.next = newNode;  //下一个节点连接新节点
			next=newNode;   //将下一个节点往后移动
		}
		ListNode hard2 = new ListNode(9), last = null,newNode = null;
		last = hard2;
		for (int i = 8; i >5; i-- ) {
			newNode = new ListNode(i);
			last.next = newNode;
			last = newNode;
		}
		addTwoNumbers(hard1,hard2);
	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode hard = new ListNode(0);
		 ListNode next = null;
		 next = hard;
		 int tmp = 0;
		 while(l1!=null || l2!=null || tmp != 0){
		 	int n1 =l1==null?0:l1.val;
		 	int n2 =l2==null?0:l2.val;
		 	tmp+=n1+n2;
		 	if(hard.val==0){
		 		hard=next=new ListNode(tmp%10);
			}
		 	else{
				ListNode newNode = new ListNode(tmp%10);
				next.next = newNode;
				next = newNode;
			}
		 	tmp/=10;
		 	if(l1!=null) l1=l1.next;
		 	if(l2!=null) l2=l2.next;
		 }
		 while(hard!=null){
			 System.out.print(hard.val+" ");
			 hard=hard.next;
		 }
		 return null;
	   
	 }

}
