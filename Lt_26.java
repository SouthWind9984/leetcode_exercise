package leetcode_exercise;

public class Lt_26 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        //快慢指针
        int slow = 0;
        for(int t: nums){
            if(slow<1||t>nums[slow-1]){
                nums[slow++]=t;
            }
        }
        return slow;
    }
}
