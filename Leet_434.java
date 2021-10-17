package LeetCode_ADailyTopic;


import java.util.Arrays;

public class Leet_434 {
    public static void main(String[] args) {

    }

    public int countSegments(String s) {
        return (int) Arrays.stream(s.split("[\\s]+")).filter(s1 -> s1.length() != 0).count();
    }
}
