package LeetCode_ADailyTopic;

public class Lt_80 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        //快慢指针
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(slow<2||nums[i]!=nums[slow-2]){
                nums[slow++]=nums[i];
            }
        }
        return slow;
    }
}
