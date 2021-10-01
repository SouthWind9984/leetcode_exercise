package LeetCode_ADailyTopic;

import java.util.Arrays;

public class Leet_274 {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        int len = citations.length, i = 0;
        Arrays.sort(citations);
        while (i++ < len && len - i > citations[i]) ;
        return len - i;
    }
}
