package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2022/12/29
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class Lc_2032 {

    class Solution {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> list = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            int [] tmp = new int[101];
            for (int i : nums1) {
                set.add(i);
                tmp[i]++;
            }
            for (int i : nums2) {
                if (set.contains(i) && !list.contains(i)){
                   list.add(i);
               }
            }
            for (int i : nums2){
                set.add(i);
            }
            for (int i : nums3){
                if (set.contains(i) && !list.contains(i)){
                    list.add(i);
                }
            }
            return list;
        }
    }
}
