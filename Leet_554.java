package leetcode_exercise;

import java.util.List;

public class Leet_554 {
    public static void main(String[] args) {

    }

    public int leastBricks(List<List<Integer>> wall) {
        int wight = 0;
        for (Integer integer : wall.get(0)) {
            wight += integer;
        }
        int height = wall.size();
        //模拟一堵墙
        boolean[][] booArr = new boolean[wight][height];
        //遍历每一列，找到最大边界
        for (int i = 0; i < height; i++) {

        }

        return 0;
    }
}
