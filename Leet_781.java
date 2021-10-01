package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

public class Leet_781 {
    public static void main(String[] args) {

    }
    public int numRabbits(int[] answers) {
        int len = answers.length;
        if(len==0)
            return 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey()%(entry.getValue()+1)==0)
                res+= (entry.getKey()/(entry.getValue()+1))*(entry.getValue()+1);
            else
                res+=(entry.getKey()/(entry.getValue()+1)+1)*(entry.getValue()+1);
        }
        return res;
    }
}
