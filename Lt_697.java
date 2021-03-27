package leetcode_exercise;

import java.util.HashMap;
import java.util.Map.Entry;

public class Lt_697 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int [] arr = {49999,0,0};
		System.out.println(findShortestSubArray(arr));;
	}
	
	
	public static int findShortestSubArray(int[] nums) {
		if(nums.length==1) {
			return 1;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int value = map.getOrDefault(nums[i],0);
			map.put(nums[i],value+1);
		}
		int max = 0;
		for(Entry<Integer, Integer> entrySet : map.entrySet()) {
			
			max =Math.max(max, entrySet.getValue());
			
		}
//		System.out.println("max = "+max);
		int [] maxdu = new int [nums.length];
		int n=0;
		for(Entry<Integer, Integer> entrySet : map.entrySet()) {
			
			if(entrySet.getValue()==max) {
				maxdu[n++]=entrySet.getKey();
			}
			
		}
		int [] arr = new int [n];
//		System.out.print("满足最大数组的度的值：");
		for (int i = 0; i < n; i++) {
			arr[i]=maxdu[i];
		}
//		System.out.println();
		
		int res  = nums.length; 
		for(int i = 0; i<arr.length;i++) {
			int m = arr[i];
		
				int right = 0;
				int left = 0;
				
				int tmp = 0;
				while(right<nums.length) {
					if(nums[right++]==m) {
						tmp++;
					}
					if(tmp==max&&left<right) {
						while(nums[left]!=m) {
							tmp--;
							left++;
						}
						res = Math.min(res, right-left);
					}
				
				}
			
		}
		
//		System.out.println(right+"  "+left);
//		System.out.println(res);		
		
		
		
//		Collection<Integer> values = map.values();
//		Object[] arr =values.toArray();
//		Arrays.sort(arr);
//		int max = Integer.parseInt(arr[arr.length-1].toString());

		
		
		
		
		

//		System.out.println(values);
//		System.out.println(map);
		return res;

		
		
    }

}
