package LeetCode_ADailyTopic;

import java.time.LocalDate;

/**
 * @author SouthWind
 * @date 2022/1/3
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1185 {

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(2, 10, 2022));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        int value = localDate.getDayOfWeek().getValue();
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return week[value - 1];
    }
}
