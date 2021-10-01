package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lt_703 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	class KthLargest {

		private ArrayList<Integer> list = new ArrayList<Integer>();
//		private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	    public KthLargest(int k, int[] nums) {
	    	for (int i : nums) {
				list.add(i);
			}
	    }
	    //插入该数据，并返回当前数据中第 val 大的元素
	    public int add(int val) {
	    	list.add(val);
	    	Object[] array = list.toArray();
	    	Arrays.sort(array);
	    	Comparator cmp = new MyComparator();
	    	int [][] arr = new int [2][2];
	    	Arrays.sort(arr,cmp);
			return (int) array[array.length-val-1];
	    }
	}
	// 实现Comparator接口
	class MyComparator implements Comparator<Integer> {
	    @Override
	    public int compare(Integer o1, Integer o2) {
	        /*
	         * 如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值， 这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了
	         */
	        return o2 - o1;
	    }
	}


}
