package leetcode_exercise;

import java.util.Stack;

public class Lt_1006 {
    public static void main(String[] args) {
        clumsy(1000);
    }
    public static int clumsy(int N) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        stack.push(N);
        for (int i = N-1; i > 0 ; i--) {
            switch (n){
                case 0:stack.push(stack.pop()*i);break;
                case 1:stack.push(stack.pop()/i);break;
                case 2:stack.push(i);break;
                case 3: stack.push(i*-1);break;
            }
//            System.out.println(stack);
            n++;
            if(n==4) n=0;
        }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
//        System.out.println(res);
        return res;
    }
}
