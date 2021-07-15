package leetcode_exercise;

public class Leet_面试10_05 {
    public static void main(String[] args) {

    }

    /*
    排序好的数组
    二分法、
    字典、

     */
    public int findString(String[] words, String s) {
        int len = words.length;
//        二分法
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            if (words[i].equals(s))
                return i;
            if (words[j].equals(s))
                return j;
        }
        return -1;
    }
}
