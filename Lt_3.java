package leetcode_exercise;

public class Lt_3 {

	public static int lengthOfLongestSubstring(String s) {
		int size_max=0;
		int size=0;
		for(int i=0;i<s.length()-1;i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				char c = s.charAt(i);
				if(c==s.charAt(j)) {
					size=j-i;
					break;
				}
				else {
					size=j-i;
				}
			}
			if(size>size_max) {
				size_max=size;
			}
		}
		
		return size_max;
		
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "pwwekw";
		char [] c = s.toCharArray();
		for(char t :c) {
			System.out.print(t+" ");
		}
		System.out.println();
//		System.out.println(c=='b');
		System.out.println(lengthOfLongestSubstring(s));
	}

}
