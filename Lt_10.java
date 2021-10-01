package LeetCode_ADailyTopic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lt_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(isMatch("aa", "a*"));

	}
	public static boolean isMatch(String s, String p) {

        Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(s);
		int n = s.length();
		if(matcher.find())
			return matcher.group().length()==n;
		return false;
    }

}
