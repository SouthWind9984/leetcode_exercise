package LeetCode_ADailyTopic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leet_65 {
    public static void main(String[] args) {

    }

    public boolean isNumber(String s) {
        String rex = "([+-]?((\\d+\\.)|(\\d+\\.\\d+)|(\\.\\d+)|(\\d+)))?([eE][+-]?\\d+)?";
        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
