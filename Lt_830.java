package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

public class Lt_830 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

        String str = "abbxxxxzzy";
		List<List<Integer>> positions = largeGroupPositions(str);
		System.out.println(positions);
//		for (List<Integer> list : positions) {
//			for (Integer n : list) {
//				System.out.println(n);
//			}
//		}
	}

    public static  List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length()-1;j++) {
				int n=0;
				char ch =s.charAt(i);
				if(ch!=s.charAt(i+1)) {
					continue;
				}
				else {
					n++;
				}
			}

        }

        return null;

    }

}
