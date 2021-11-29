package LeetCode_ADailyTopic;

public class Leet_Offer_69 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        for (; i <= j; i++, j--) {
            int mid = (i + j) / 2;
            if (arr[i] < mid) {
                i = mid + 1;
            }
            else {
                j= mid-1;
            }
        }
        return j;
    }
}
