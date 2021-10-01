package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

public class Lt_288 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {0,2,3,4,6,8,9};
		System.out.println(summaryRanges(nums));
	}
	public static List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		if(nums.length==0) {
			return res;
		}

		else if(nums.length==1) {
			res.add(""+nums[0]);
			return res;
		}
		else {
			int top=nums[0];
			int foot=nums[0];
			for(int j=1;j<nums.length;j++) {
                if (nums[j] - nums[j - 1] == 1)
                    foot = nums[j];
                else {
                    if (foot != top) {
                        res.add("" + top + "->" + foot);
                    } else {
                        res.add("" + top);
                    }
                    top = nums[j];
                    foot = nums[j];
				}
			}
			if(foot!=top) {
				res.add(""+top+"->"+foot);
			}
			else {
				res.add(""+top);
			}

        }
		return res;
    }

}
