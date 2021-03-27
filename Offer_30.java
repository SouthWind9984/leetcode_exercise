package leetcode_exercise;

import java.util.Stack;

public class Offer_30 {
    public static void main(String[] args) {

    }
    class MinStack {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        /** initialize your data structure here. */
        public MinStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
            if(stack2.empty()||stack2.peek()>x){
                stack2.push(x);
            }
            else
                stack2.push(stack2.peek());
        }

        public void pop() {
            stack2.pop();
            stack1.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stack2.peek();
        }
    }
}
