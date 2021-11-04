import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leet_187 {
    public static void main(String[] args) {

    }

    public List<String> findRepeatedDnaSequences(String s) {
        int index = 0;
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        while (index+10<=s.length()){
            String substring = s.substring(index, index+10);
            if(map.containsKey(substring)){
                if (map.get(substring)==1){
                    list.add(substring);
                    map.put(substring,0);
                }
            }else{
                map.put(substring,1);
            }
            index++;
        }
        return list;
    }
}
