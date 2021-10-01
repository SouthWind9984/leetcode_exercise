package LeetCode_ADailyTopic;

public class Lt_461 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		System.out.println(hammingDistance(1000000004, 1323219312));
	}

	public static int hammingDistance(int x, int y) {
//		return test(x, y);

        int tmp = x^y;
		int res = Integer.bitCount(tmp);
//		String binaryString = Integer.toBinaryString(tmp);
//		for (int i = 0; i < binaryString.length(); i++) {
//			if(binaryString.charAt(i)=='1')
//				res++;
//		}
		return res;
    }

	public static int test(int x, int y) {
		int res = 0;
		String binaryString1 = Integer.toBinaryString(x);
		String binaryString2 = Integer.toBinaryString(y);
		int len1 = binaryString1.length();
		int len2 = binaryString2.length();
		if(len1<len2) {
			for (int i = 0; i < len2-len1; i++) {
				binaryString1='0'+binaryString1;
			}
			for (int i = 0; i < len2; i++) {
				if(binaryString1.charAt(i)!=binaryString2.charAt(i)) {
					res++;
				}
			}
		}
		else if(len1>len2){
			for (int i = 0; i < len1-len2; i++) {
				binaryString2='0'+binaryString2;
			}
			for (int i = 0; i < len1; i++) {
				if(binaryString1.charAt(i)!=binaryString2.charAt(i)) {
					res++;
				}
			}
		}
		else {
			for (int i = 0; i < len1; i++) {
				if(binaryString1.charAt(i)!=binaryString2.charAt(i)) {
					res++;
				}
			}
		}


        return res;
	}

}
