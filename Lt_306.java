package LeetCode_ADailyTopic;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Lt_306 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	}

    class NumArray {

		private int[] arr;
		private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	    public NumArray(int[] nums) {
	    	arr = new int [nums.length+1];
	    	int sum = 0;
	    	for (int i = 0; i < nums.length; i++) {
	    		sum+=nums[i];
	    		arr[i+1]=sum;
	    	}
	    }
	    public void update(int index, int val) {
	    	map.put((index+1),arr[index+1]-val);
	    }

        public int sumRange(int left, int right) {
	    	int res = arr[right-left];
	    	if(map.firstKey()>right)
	    		return res;
	    	if(map.lastKey()<left)
	    		return res;
	    	for(Entry<Integer, Integer> entrySet : map.entrySet())
	    	{
	    		res-=entrySet.getValue();
	    	}
	    	if(map.size()>0) {
	    		for(int i = left ; i<=right;i++) {
	    			if(map.get(i)!=null)
	    				res-=map.get(i);
	    		}
	    	}

            return res;

	    }
	}

}

