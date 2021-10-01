package LeetCode_ADailyTopic;

public class Lt_331 {
    public static void main(String[] args) {
        String s = "1";
        System.out.println(isValidSerialization(s));
    }
    public static boolean isValidSerialization(String preorder) {
        String[] split = preorder.split(",");
        int len = split.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if(!split[i].equals("#")) res++;
            else res--;
            if(res<0&&i<len-1) return false;
        }
        return res==-1;
    }
}
