package leetcode_exercise;

import java.util.HashMap;
import java.util.Map;

public class Lt_914 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		
		int [] deck = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
		boolean f = hasGroupsSizeX(deck);
		System.out.println(f);
	}

	 public static boolean hasGroupsSizeX(int[] deck) {
		 if(deck.length == 1)return false;
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i < deck.length;i++){
	            int value = map.getOrDefault(deck[i],0);
	            map.put(deck[i],value + 1);
	        }
	        int g = -1;
	        for(Integer value : map.values()){
	            if(g == -1)g = value;
	            else g = gcd(g,value);
	        }
	        return g >= 2;

	    }
	    public static int gcd(int x, int y) {
	        return x == 0 ? y : gcd(y % x, x);
	    }
	 
	
}
