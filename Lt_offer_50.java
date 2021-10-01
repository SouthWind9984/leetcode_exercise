package LeetCode_ADailyTopic;

public class Lt_offer_50 {
    public static void main(String[] args) {

    }
    public char firstUniqChar(String s) {
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            int index = s.indexOf(ch);
            if(s.indexOf(ch,index+1)==-1)
                return ch;
        }
        return ' ';
    }
}
