package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * @author SouthWind
 * @date 2021/12/6
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1700 {
    public static void main(String[] args) {

    }

    /**
     * 队列中喜欢 0 和 1 之差
     *
     * @param students
     * @param sandwiches
     * @return
     */
    public int countStudents(int[] students, int[] sandwiches) {
        long count0 = Arrays.stream(students).filter(item -> item == 0).count();
        long count1 = students.length - count0;
        int len = sandwiches.length;
        for (int i = 0; i < len; i++) {
            int sandwich = sandwiches[i];
            if (sandwich == 0) {
                count0--;
            } else if (sandwich == 1) {
                count1--;
            }
            if (count0 == -1 || count1 == -1) {
                return len - i;
            }
        }
        return 0;
    }
}
