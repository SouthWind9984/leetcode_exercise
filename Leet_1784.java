package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/3 8:01
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_1784 {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean checkOnesSegment(String s) {
            //找到起始1 末尾1，看中间是否有0
            int index1 = s.indexOf('1');
            int index2 = s.lastIndexOf('1');
            if (index1 == index2) return true;
            int index3 = s.indexOf('0');
            if (index3 == -1) return true;
            return !(index1 < index3 && index3 < index2);
        }
    }
}
