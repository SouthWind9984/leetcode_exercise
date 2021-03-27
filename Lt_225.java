package leetcode_exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Lt_225 {
    public static void main(String[] args) {

    }

    class MyStack {

        Queue<Integer> Input;
        Queue<Integer> Output;
        /** Initialize your data structure here. */
        public MyStack() {
            Input = new LinkedList<>();
            Output = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            Input.offer(x);  //加入新元素
            while(!Output.isEmpty()){
                Input.offer(Output.poll());  //将之前的值加到后面
            }
            //output 和 input 交换 ，input始终为空，output为一个出栈队列
            Queue<Integer> tmp = Input;
            Input = Output;
            Output = tmp;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return  Output.poll();
        }

        /** Get the top element. */
        public int top() {
            return Output.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return Output.isEmpty();
        }
    }
}
