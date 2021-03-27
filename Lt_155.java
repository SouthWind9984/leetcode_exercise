package leetcode_exercise;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.*;

public class Lt_155 {
    public static void main(String[] args) {
        TreeSet<Integer> stack = new TreeSet<>();
        stack.add(1);
        stack.add(10);
        stack.add(5);
        stack.add(10);
        System.out.println(stack);
    }

    class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;
//        private TreeMap<Integer,Integer> map;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
//            map = new TreeMap<>();
        }

        public void push(int x) {
            stack.push(x);
            if(minStack.empty()||minStack.peek()>x) {
                minStack.push(x);
            }
            else
                minStack.push(minStack.peek());
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
