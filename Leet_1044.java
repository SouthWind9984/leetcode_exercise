package LeetCode_ADailyTopic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SouthWind
 * @date 2021/12/23
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 */

public class Leet_1044 {

    public static void main(String[] args) {
        String str = "rtbbfywifhhthadpjixdeodqfgjfykvjwagudthnwfjdqyfskgczdzdsomkxfeizyfnmkirnklfevunbwvevymyoxcnddzhrqnengvjrptpgkusjfpcivknmpcptgbkosyujjcpqugnizpfqfxzrpyxmtbvpxqfbrrupmppkxyltyumcxtyefxjqlmpfymxvrbjmxvqtgnorweoujekkbpdzvhzvchdslcbmavwmjnlypoexhqoxfrnglcyhetrhpemrryhoanasaoyfxeznfeqkgqkzxcuphvngwryfouyugtrhxjfkegzgypucmpanrgyourwglemiclqkcubxbjzhkqzqextijwbfyizgylkyjxeuulkurebpovcxklywnwflnvmufbaauloekgtnabkvfvlsghtgqrkvopcablizoqdcxomhhyxtuwdebmjihmchdxtklvdecwvgogwwepqowfuwluklfiibyqaikphnfpfzhralzuuhsptonslvmkfojfdsumnwwacfwqxkotcqewulorinpzmhduhriisuajcpwjeanvyvpyefglpmfcicsglxtwadtrtaxnozxvchwagdyyinhqmhofuknauhwkinwzmrmermnnzndaxmqkgzotjgkxqhfqvgnvzymvcmdqpfiixrkmjpdbelzojbjeublnwcdsckbpwbbwlloxhecimaysjzwbppgmzywbouicyjdcsaffcxxkmwoamjzicswfzhccdlzewmzotyzprhreseqgmafkzkjqzwukrunckowdfajqhyrhhfhjfuzhvwgkwrmmpgribxqchowwvlbppnkofdfdennafqzawkycytghxehrjwdbrgroqfyoxynkketzkmglrsbqaxgfbiwhtuhzlpszsgbybawnguqhyadwteiikbahnhqdpvmobcsozloyyopxsnjlbgisytssbjbbuucqyvobnflnxtd";
        System.out.println(longestDupSubstring(str));
    }

    public static String longestDupSubstring(String s) {
        int length = s.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i < length + 1; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
            }
        }
        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value < 2) continue;
            String key = entry.getKey();
            if (key.length() > res.length()) {
                res = key;
            }
        }
        return res;
    }
}
