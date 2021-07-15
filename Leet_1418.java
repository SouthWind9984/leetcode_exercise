package leetcode_exercise;

import java.util.*;

public class Leet_1418 {
    public static void main(String[] args) {

    }

    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> set = new HashSet<>();
//        《桌号，《餐品，数量》》
        TreeMap<Integer, TreeMap<String, Integer>> treeMap = new TreeMap<>();
        for (List<String> order : orders) {
            String food = order.get(2);
            set.add(food);
            int table = Integer.parseInt(order.get(1));
            TreeMap<String, Integer> treeMap1;
            if (treeMap.containsKey(table)) treeMap1 = treeMap.get(table);
            else treeMap1 = new TreeMap<>();
            treeMap1.put(food, treeMap1.getOrDefault(food, 0) + 1);
            treeMap.put(table, treeMap1);
        }
        List<String> foods = new ArrayList<>(set);
        List<List<String>> res = new ArrayList<>();
        foods.sort(String::compareTo);
        foods.add(0, "Table");
        res.add(foods);
        for (Map.Entry<Integer, TreeMap<String, Integer>> Entry : treeMap.entrySet()) {
            List<String> tables = new ArrayList<>();
            tables.add(String.valueOf(Entry.getKey()));
            for (int i = 1; i < foods.size(); i++) {
                Integer number = Entry.getValue().get(foods.get(i));
                tables.add(number == null ? "0" : String.valueOf(number));
            }
            res.add(tables);
        }
        return res;
    }
}
