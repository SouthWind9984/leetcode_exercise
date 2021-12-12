package LeetCode_ADailyTopic;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author SouthWind
 * @date 2021/12/11
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_911 {

    public static void main(String[] args) {

    }

    class TopVotedCandidate {
        int[] arr;
        Map<Integer, int[]> map;

        public TopVotedCandidate(int[] persons, int[] times) {
            int length = times.length;
            map = new TreeMap<>();
            arr = new int[length];
            for (int i = 0; i < length; i++) {
                int person = persons[i];
                int time = times[i];
                arr[person]++;
                map.put(time, arr.clone());
            }

        }

        public int q(int t) {
            int index = 0;
            for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
                int key = entry.getKey();
                if (key <= t) {
                    // System.out.println(entry.getKey()+" " + Arrays.toString(entry.getValue()));
                    int[] value = entry.getValue();
                    int max = value[0];
                    for (int j = 1; j < value.length; j++) {
                        int tmp = value[j];
                        if (tmp == 0) break;
                        if (tmp > max) {
                            max = tmp;
                            index = j;
                        }
                    }
                }
            }
            return index;
        }
    }
}
