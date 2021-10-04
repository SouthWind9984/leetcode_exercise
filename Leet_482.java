package LeetCode_ADailyTopic;


public class Leet_482 {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.replace("-", "").toUpperCase());
        int len = sb.length() - k;
        for (int i = len; i > 0; i -= k) {
            sb.insert(i, '-');
        }
        return sb.toString();
    }
}
