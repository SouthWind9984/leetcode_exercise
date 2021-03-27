package leetcode_exercise;

import java.util.Scanner;

public class Lt_202 {
	/**
	 * 编写一个算法来判断一个数 n 是不是快乐数。

「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。

如果 n 是快乐数就返回 True ；不是，则返回 False 。


	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner  in = new Scanner(System.in);
		int n = in.nextInt();
		int nn = n;
		
		boolean flag = false;
		for(int i=1;i<=100;i++)
		{
			int result = 0;
			while(n>0)
			{
				result += Math.pow(n%10, 2);
				n/=10;
			}
			if(result==1) {
				flag =true;
				break;
			}
			else
				n = result;
		}
		if(flag) {
		System.out.println(nn);//是快乐数的话输出
		}
	}

}
