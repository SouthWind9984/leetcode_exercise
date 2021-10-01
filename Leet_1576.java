package LeetCode_ADailyTopic;

public class Leet_1576 {
    public static void main(String[] args) {
       String s ="b?a";
        System.out.println(modifyString(s));
    }

    public static String modifyString(String s) {
        int len = s.length();
        int index = s.indexOf('?');
        while(index!=-1){
            char tmp = 'a';
            s = s.substring(0,index)+tmp+s.substring(index+1);
            //前后判断
            while (index<len-1&&s.charAt(index)==s.charAt(index+1)||index>0&&s.charAt(index)==s.charAt(index-1)){
                s = s.substring(0,index)+(tmp++)+s.substring(index+1);
            }
//            System.out.println(s);
            index=s.indexOf('?');
        }
        return s;
    }
}
