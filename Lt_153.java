package leetcode_exercise;

public class Lt_153 {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        /*
        右侧向左依次递减，左侧向右依次递增
        右侧为最大值， 左侧为最小值
        右侧比左侧大，未旋转，右侧比左侧小，旋转
        找最小值
         */
        int len = nums.length;
        if (len==1)
            return nums[0];
        //最后的值大于第一个值，则该数组未旋转
        if(nums[0]<nums[len-1])
            return nums[0];
        //然后就是被旋转的数组
        int right = len-1;
        while(right>1 && nums[right--]>nums[right-1]){}
        return nums[right];
    }
}
