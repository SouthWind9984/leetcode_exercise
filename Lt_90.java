package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt_90 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {1,2,3};
		System.out.println("ans = " + subsetsWithDup(nums));;
	}

	/**
	 *
	 * 子集II
	 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
	 *
	 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列
	 *
	 * @param nums
	 * @return
	 */
		public static List<List<Integer>> subsetsWithDup(int[] nums) {
			Arrays.sort(nums);
			List<List<Integer>> ans = new ArrayList<>();
			List<Integer> cur = new ArrayList<>();
			dfs(nums, 0, cur, ans);
			return ans;
		}

		/**
		 * @param nums 原输入数组
		 * @param u 当前决策到原输入数组中的哪一位
		 * @param cur 当前方案
		 * @param ans 最终结果集
		 */
		static void dfs(int[] nums, int u, List<Integer> cur, List<List<Integer>> ans) {
			// 所有位置都决策完成，将当前方案放入结果集
			int n = nums.length;
			if (n == u) {
				ans.add(new ArrayList<>(cur));
				return;
			}

			// 记录当前位置是什么数值（令数值为 t），并找出数值为 t 的连续一段
			int t = nums[u];
			int last = u;
			while (last < n && nums[last] == nums[u]) last++;

			// 不选当前位置的元素，直接跳到 last 往下决策
			dfs(nums, last, cur, ans);

			// 决策选择不同个数的 t 的情况：选择 1 个、2 个、3 个 ... k 个
			for (int i = u; i < last; i++) {
				cur.add(nums[i]);
				dfs(nums, last, cur, ans);
			}

			// 回溯对数值 t 的选择
			for (int i = u; i < last; i++) {
				cur.remove(cur.size() - 1);
			}
		}

	public static List<List<Integer>> subsetsWithDup1(int[] nums) {
		int len = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		//注意如果有重复元素且又要做排列或者子集的话我们一般先排序，方便后面剪枝
		Arrays.sort(nums);
		backtrack(0,len,nums,res,new ArrayList<Integer>());
		return res;

	}
	public static void backtrack(int index,int length,int [] nums,List<List<Integer>> res,List<Integer> temp){
		//注意拷贝
		res.add(new ArrayList(temp));
		for(int i = index;i<length;i++){
			//剪枝 去重
			if(i>index && nums[i] == nums[i-1]){
				continue;
			}
			//选择节点
			temp.add(nums[i]);
			// 继续探索新的节点 i+1
			backtrack(i+1,length,nums,res,temp);
			//撤销选择
			temp.remove(temp.size()-1);
		}
	}
}
