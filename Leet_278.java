package LeetCode_ADailyTopic;

public class Leet_278 {
    public static void main(String[] args) {

    }

    public boolean isBadVersion(int version) {
        return false;
    }

    ;

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return left;
    }

}
