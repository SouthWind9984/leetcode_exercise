package LeetCode_ADailyTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SouthWind
 * @date 2022/10/21 17:15
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_901 {
    public static void main(String[] args) {

    }

    class StockSpanner {
        private List<Integer> list;
        private List<Integer> ansList;
        int index = 0;

        public StockSpanner() {
            list = new ArrayList<>();
            ansList = new ArrayList<>();
        }

        public int next(int price) {
            list.add(price);
            return maxCount(price);
        }

        public int maxCount(int price) {
            int count = 1;
            if (list.size() > 2) {
//                拿前一个元素比较
                for (int i = list.size() - 2; i >= 0; i--) {
                    if (price >= list.get(i)) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            return count;
        }
    }

}
