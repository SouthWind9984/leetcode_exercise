package LeetCode_ADailyTopic;

import java.util.Stack;

public class Lt_232 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stack<Integer> input = new Stack<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		Integer push = input.push(2);
		System.out.println(input+" "+push);
	}
	class MyQueue {

        private Stack<Integer> input;
		private Stack<Integer> output = new Stack<Integer>();

        /** Initialize your data structure here. */
	    public MyQueue() {
	    	input = new Stack<Integer>();
	    }

        /** Push element x to the back of queue. */
	    public void push(int x) {
	    	input.push(x);
	    }

        /** Removes the element from in front of queue and returns that element. */
	    public int pop() {  //移除开头元素并返回
	    	while(output.empty()) {
	    		output.push(input.pop());
	    	}
			return output.pop();
	    }

        /** Get the front element. */
	    public int peek() {  //返回开头元素并不删除
	    	while(output.empty()) {
	    		output.push(input.pop());
	    	}
			return output.peek();
	    }

        /** Returns whether the queue is empty. */
	    public boolean empty() {
			return input.empty()&&output.isEmpty();
	    }
	}

	/**
	 * Your MyQueue object will be instantiated and called as such:
	 * MyQueue obj = new MyQueue();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.peek();
	 * boolean param_4 = obj.empty();
	 */

}
