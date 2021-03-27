package leetcode_exercise;

import java.util.HashMap;
import java.util.Map.Entry;

public class Lt_1128 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] arr = {{1,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2},{1,2},{1,1},{1,2},{2,2}};
		System.out.println(numEquivDominoPairs(arr));
	}
	
	public static int numEquivDominoPairs(int[][] dominoes) {
		int sum=0;
		HashMap<Integer,Integer> hashMap =  new HashMap<Integer, Integer>();
		for (int i = 0; i < dominoes.length; i++) {
			 Integer key = dominoes[i][0]>dominoes[i][1]?dominoes[i][0]*10+dominoes[i][1]:dominoes[i][1]*10+dominoes[i][0];
			 Integer val = hashMap.get(key);
			 if(val==null) {
				 hashMap.put(key, 1);
			 }
			 else {
				 hashMap.put(key, val+1);
			 }
		}
		for(Entry<Integer, Integer> entry : hashMap.entrySet()) {
			int count = entry.getValue();
			sum+=count*(count-1)/2;
		}
		return sum;

    }
}
