package leetcode_exercise;

public class Lt_9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(isPalindrome(1221));
	}
	public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String str = ""+x;
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
			if(chars[i]!=chars[chars.length-1-i])
				return false;
		}
        return true;
	}

}
