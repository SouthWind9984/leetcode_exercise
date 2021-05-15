package leetcode_exercise;

public class Leet_1287 {
    public static void main(String[] args) {

    }

    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (count > len * 0.25) {
                return arr[i];
            }
        }
        return 0;
    }
}
