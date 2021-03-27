package leetcode_exercise;

import java.util.ArrayList;
import java.util.List;

public class Lt_448 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));

	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();	
        for(int i = 0; i < nums.length; i++){
        	int n = Math.abs(nums[i])-1;
        	nums[n] = -1*Math.abs(nums[n]);
        }
        for (int i = 0; i < nums.length; i++) {
        	if(nums[i]>0) {
        		res.add(i+1);
        	}
		}
        return res;
    }

}
