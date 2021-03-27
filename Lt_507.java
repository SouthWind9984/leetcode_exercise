package leetcode_exercise;

import java.util.ArrayList;

public class Lt_507 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(checkPerfectNumber(496));
		
	}
	
	public static boolean checkPerfectNumber(int num) {
  
		if(num==1)return false;
        int sum =1;
        for(int i=2;i<Math.sqrt(num);i++) {
        	if(num%i==0) {
        		sum+=i;
        		sum+=num/i;   //算平方根的时候，需要加上它的倍数
        	}
        }
        if(sum==num)
        	return true;
        else
        	return false;
    }

}
