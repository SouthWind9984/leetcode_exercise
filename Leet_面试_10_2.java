package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leet_面试_10_2 {
    public static void main(String[] args) {
        String[] strs = {"pal", "ugh", "boy", "sir", "nay", "sap", "zoe", "tan", "pym", "tho", "lea", "hod", "vim", "mes", "qua", "lag", "jib", "meg", "guy", "tat", "hue", "fez", "zit", "owe", "maj", "die", "dos", "bus", "dew", "yum", "gos", "deb", "pis", "mod", "poi", "hug", "ado", "dot", "fob", "tee", "oil", "bah", "wok", "sip", "eve", "dee", "bob", "cid", "han", "mit", "ram", "wis", "ark", "pry", "mys", "wag", "eng"};
        System.out.println(groupAnagrams(strs));
        String o1 = "hug";
        String o2 = "oil";
        int n1 = 0;
        int n2 = 0;
        int len1 = o1.length();
        int len2 = o2.length();
        for (int i = 0; i < len1; i++) {
            n1 += o1.charAt(i);
        }
        for (int i = 0; i < len2; i++) {
            n2 += o2.charAt(i);
        }
//        System.out.println(o1+":"+n1+"   "+o2+":"+n2);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            int hashCode = Arrays.hashCode(chars);
            if (!map.containsKey(hashCode)) {
                map.put(hashCode, new ArrayList<>());
            }
            map.get(hashCode).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

