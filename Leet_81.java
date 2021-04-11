package leetcode_exercise;

public class Leet_81 {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        //双指针  //二分 --前序--后序
        int len = nums.length;
        if (len==1)
            return nums[0]==target;
        int left = 0;
        int right = len-1;
        while (left<right && (nums[left]<=nums[left+1]||nums[right]>=nums[right-1])){
            if(nums[right]==target || nums[left]==target)
                return true;
            if(nums[left]<=nums[left+1])
                left++;
            if (nums[right]>=nums[right-1])
                right--;
        }
        return nums[right] == target || nums[left] == target;
    }
}
