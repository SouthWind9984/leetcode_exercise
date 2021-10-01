package LeetCode_ADailyTopic;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leet_1436 {

    public static void main(String[] args) {

    }

    public String destCity1(List<List<String>> paths) {
        Set<String> resSet = new HashSet<>();
        for (List<String> path : paths) {
            resSet.add(path.get(0));
        }
        for (List<String> path : paths) {
            String s = path.get(1);
            if (!resSet.contains(s)) {
                return s;
            }

        }
        return null;
    }

    public String destCity2(List<List<String>> paths) {
        StringBuilder sb = new StringBuilder();
        for (List<String> path : paths) {
            sb.append(path.get(0));
        }
        for (List<String> path : paths) {
            String s = path.get(1);
            if (sb.indexOf(s) == -1) {
                return s;
            }
        }
        return null;
    }
}
