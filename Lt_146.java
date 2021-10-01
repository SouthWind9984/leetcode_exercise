package LeetCode_ADailyTopic;

import java.util.Stack;

public class Lt_146 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.push(6);
        int index = stack.size()-stack.search(3);
        System.out.println(stack);
        stack.set(index,5);
        System.out.println(stack);
    }
    class LRUCache {
        //利用两个栈保存key和value;
        private Stack<Integer> stackKey;
        private Stack<Integer> stackvalue;
        private int size = 0;
        public LRUCache(int capacity) {
           stackKey = new Stack<>();
           stackvalue = new Stack<>();
           this.size = capacity;
        }

        public int get(int key) {
            int index = stackKey.search(key);
            if(index==-1)
                return index;
            else{
                //将栈中元素弹出，放到栈顶，栈底则为使用最少的元素
                int k = stackKey.remove(stackKey.size() - index);
                stackKey.push(k);
                int value = stackvalue.remove(stackKey.size() - index);
                stackvalue.push(value);
                return value;
                }
        }

        public void put(int key, int value) {
            //key不存在，直接push
            if(get(key)==-1){
                stackKey.push(key);
                stackvalue.push(value);
                if(stackKey.size()>this.size) {
                    stackKey.remove(0);
                    stackvalue.remove(0);
                }
            }
            //key存在，将value栈中的值改变
            else{
                int index =stackKey.size()-stackKey.search(key);
                stackvalue.set(index,value);
            }
        }
    }

}
