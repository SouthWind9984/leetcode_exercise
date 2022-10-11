package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2022/10/5 18:28
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_811 {

    public static void main(String[] args) {

    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            int count = Integer.parseInt(split[0]);
            String domain = split[1];
            int index = 0;
            do {
                domain = domain.substring(index + 1);
                index = domain.indexOf('.');
                map.put(domain, map.getOrDefault(domain, 0) + count);
            } while (index != -1);
        }
        List<String> ansList = new ArrayList<>();
        for (String s : map.keySet()) {
            ansList.add(map.get(s) + " " + s);
        }
        return ansList;
    }

    public List<String> subdomainVisits1(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] split = domain.split(" ");
            int count = Integer.parseInt(split[0]);
            String s = split[1];
            String[] s1 = s.split("\\.");
            StringBuilder str = new StringBuilder();
            for (int i = s1.length - 1; i >= 0; i--) {
                if (str.length() > 1) {
                    str.insert(0, '.');
                }
                str.insert(0, s1[i]);
                map.put(str.toString(), map.getOrDefault(str.toString(), 0) + count);
            }
        }
        List<String> ansList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            ansList.add(value + " " + key);
        }
        return ansList;
    }
}
