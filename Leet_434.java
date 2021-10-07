package LeetCode_ADailyTopic;


public class Leet_434 {
    public static void main(String[] args) {

    }

    public int countSegments(String s) {
        String[] split = s.split("[\\s]+");
        int res = 0;
        for (String s1 : split) {
            if (s1.length() > 0) {
                res++;
            }
        }
        return res;
    }
}
