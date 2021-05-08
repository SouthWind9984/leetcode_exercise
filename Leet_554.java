package leetcode_exercise;

import java.util.*;

public class Leet_554 {
    public static void main(String[] args) {
        ArrayList arrays = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrays.add(i);
        }
        System.out.println(Collections.max(arrays));
        Collection<Integer> values = new ArrayList<>();
    }

    public int leastBricks(List<List<Integer>> wall) {
        int height = wall.size();
        //模拟一堵墙
//        boolean[][] booArr = new boolean[height][wight];
        HashMap<Integer, Integer> map = new HashMap<>();
        //遍历每一列，找到最大边界
        for (int i = 0; i < wall.size(); i++) {
            List<Integer> list = wall.get(i);
            int sum = 0;
            for (int j = 0; j < list.size() - 1; j++) {
                Integer n = list.get(j);
                sum += n;
//                booArr[i][sum]=true;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
//        System.out.println(map);
        Collection<Integer> values = new ArrayList<>();
        values = map.values();
        Integer max = Collections.max(values);
        return height - max;
    }
}
