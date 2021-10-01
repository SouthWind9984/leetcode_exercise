package LeetCode_ADailyTopic;

import java.util.HashMap;

public class Lt_3 {

	public static void main(String[] args) {
		String  s = "abcabcabacada";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		if(len<=1)
			return len;
		int res = 0;
		int start = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		for (int i = 0 ; i < len; i++) {
			if(map.containsKey(s.charAt(i))){
				start = Math.max(start,map.get(s.charAt(i))+1); //记录重复字符位置
			}
			map.put(s.charAt(i),i);
			res = Math.max(res,i-start+1);
		}
		return res;
	}


}
