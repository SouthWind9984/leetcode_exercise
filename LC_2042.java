package LeetCode_ADailyTopic;

import java.util.Arrays;

/**
 * 2023/1/3 8:59
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_2042 {

    public boolean areNumbersAscending(String s) {
        String[] split = s.split(" ");
        int pre = 0;
        for (String s1 : split) {
            int i;
            try {
                i = Integer.parseInt(s1);
            }catch (NumberFormatException e){
                continue;
            }
            if (i > pre){
                pre = i;
            }else{
                return false;
            }
        }
        return true;
    }
}
