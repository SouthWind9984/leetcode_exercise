package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2021/12/21
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1154 {
    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        int dayOfYear = now.getDayOfYear();
//        System.out.println(MessageFormat.format("{0}是{1}年的第{2}天", format,String.valueOf(now.getYear()), dayOfYear));
        System.out.println(dayOfYear("2004-03-01"));
    }

    public static int dayOfYear(String date) {
        char[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateArr = date.split("[-]");
        int year = Integer.parseInt(dateArr[0]);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            months[1]++;
        }
        int month = Integer.parseInt(dateArr[1]);
        int sum = 0;
        for (int i = 1; i < month; i++) {
            sum += months[i - 1];
        }
        int day = Integer.parseInt(dateArr[2]);
        return sum + day;
    }
}
