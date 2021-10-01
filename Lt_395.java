package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map.Entry;

public class Lt_395 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(longestSubstring("ababacb", 3));
	}
	public static int longestSubstring(String s, int k) {
		if(s.length()<k)
			return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		String split ="";
		boolean b = true;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()<k) {
				split+=entry.getKey()+"|";
				b=false;
			}
		}
		if(b)
			return s.length();
		map.clear();
		split=split.substring(0,split.length()-1);
		int max = 0;
		for (String str : s.split(split)) {
			max = Math.max(max, longestSubstring(str, k));
		}
		return max;
    }


}
