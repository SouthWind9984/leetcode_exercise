package leetcode_exercise;

import java.util.Arrays;

public class Lt_mian0301 {
    public static void main(String[] args) {

    }
    class TripleInOne {
        private int[] arr;
        private int size;
        public TripleInOne(int stackSize) {
            //将一个数组分为三份
            arr = new int[3*stackSize];
            this.size = stackSize;
            Arrays.fill(arr,-1);
        }

        public void push(int stackNum, int value) {
            //所要操作栈的范围
            int start = this.size*stackNum;
            int end = this.size*(stackNum+1);
            for (int i = start ; i < end; i++) {
                if(arr[i]==-1){
                    arr[i]=value;
                    break;
                }
            }
        }
        //弹出当前栈的第一个元素
        public int pop(int stackNum) {
            //所要操作栈的范围
            int start = this.size*stackNum;
            int end = this.size*(stackNum+1);
            for (int i = end-1 ; i>=start ; i--) {
                int n = arr[i];
                if(n!=-1){
                    arr[i]=-1;
                    return n;
                }
            }
            return -1;
        }
        //返回当前栈的第一个元素，不删除
        public int peek(int stackNum) {
            //所要操作栈的范围
            int start = this.size*stackNum;
            int end = this.size*(stackNum+1);
            for (int i = end-1 ; i>=start ; i--) {
                int n = arr[i];
                if(n!=-1){
                    return n;
                }
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            return peek(stackNum)==-1;
        }
    }
}
