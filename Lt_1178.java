package leetcode_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lt_1178 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] words = {"aaaa","asas","able","ability","actt","actor","access"};
		String [] puzzles = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
		System.out.println(findNumOfValidWords(words, puzzles));
	}
	
	/**
	 * 枚举
	 * @param words
	 * @param puzzles
	 * @return
	 */
	public static List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
		
		List<Integer> resList = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String str ="";
		int tmp = 0 ;
		for (int i = 0; i < words.length; i++) {
			str = words[i];
			tmp=0;
			for (int j = 0; j < str.length(); j++) {
				tmp = tmp | (1<<str.charAt(j));
			}
			map.put(tmp, map.getOrDefault(tmp, 0)+1);
		}
		for (int i = 0; i < puzzles.length; i++) {
			str = puzzles[i];
			tmp = 0 ;
			for (int j = 0; j < str.length(); j++) {
				tmp = tmp | (1<<str.charAt(j));
			}
			// 枚举子集
			int cnt = 0;
			  for (int k = tmp; k != 0; k = (k - 1) & tmp) {
				  if(((1<<str.charAt(0))&k)!=0)
					  cnt+=map.getOrDefault(k,0);
	          }
			  resList.add(cnt);
		}
		return resList;
    }

}
