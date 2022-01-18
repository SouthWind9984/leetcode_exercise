package LeetCode_ADailyTopic;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author SouthWind
 * @date 2022/1/6
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_71 {
    public static void main(String[] args) {
        String s = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(s));
    }

    public static String simplifyPath(String path) {
        String[] split = path.split("/");
        System.out.println(Arrays.toString(split));
        Deque<String> deque = new ArrayDeque<>();
        for (String s : split) {
            if (s.equals(".") || s.length() == 0) continue;
            else if (s.equals("..")) deque.pollLast();
            else deque.offer(s);

        }
        System.out.println(deque);
        if (deque.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder("/");
        while (!deque.isEmpty()) {
            String pop = deque.poll();
            if (pop.length() == 0) continue;
            stringBuilder.append(pop).append("/");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

}
