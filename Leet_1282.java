package leetcode_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet_1282 {

    public static void main(String[] args) {

    }

    /*
    索引下标为用户id,值为所在组的大小
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int len = groupSizes.length;
//        哈希表映射
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int groupSize = groupSizes[i];
            if (map.containsKey(groupSize)) {
                List<List<Integer>> lists = map.get(groupSize);
            }
//            else map.put(groupSize,
            List<Integer> list = new ArrayList<>();
        }


        return null;
    }

}
