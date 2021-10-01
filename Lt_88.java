package LeetCode_ADailyTopic;

public class Lt_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //从后往前排
        int index = m--+--n;
        while(n>=0){
            nums1[index--] = m>=0 && nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}
