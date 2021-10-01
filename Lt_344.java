package LeetCode_ADailyTopic;

public class Lt_344 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		char [] s = {'h','e','l','l','o'};
		reverseString(s);
	}


    public static void reverseString(char[] s) {
		for(int i=0;i<s.length/2;i++)
		{
			char swap=' ';
			swap=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=swap;
		}
		for(char t:s) {
			System.out.print(t);
		}
    }

}
