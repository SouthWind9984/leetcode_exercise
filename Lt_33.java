package leetcode_exercise;

public class Lt_33 {
    public static void main(String[] args) {

    }
    /*
        旋转数组，
        右侧值最大，向左依次递减
        左侧值最小，向右依次递增
        ！且右侧最大值小于左侧最小值 ！
        判断目标数值大致所在位置
     */
    public int search(int[] nums, int target) {
        //二分查找
        int len = nums.length;
        if(len==1)
            return nums[0]==target?0:-1;
        int left = 0;
        int right = len-1;
        //小于右侧最大值，从右向左走
        while (right>left && (target <= nums[right]) && (nums[right] > nums[right - 1])){
            if(nums[right]==target)
                return right;
            right--;
        }
        //大于左侧最小值，从左向右走
        while (right>left &&(target >= nums[left]) && (nums[left] < nums[left + 1])){
            if (nums[left]==target)
                return left;
            left++;
        }
        if (nums[left]==target)
            return left;
        if(nums[right]==target)
            return right;
        return -1;
    }
}
