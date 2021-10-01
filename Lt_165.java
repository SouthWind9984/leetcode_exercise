package LeetCode_ADailyTopic;

public class Lt_165 {
    public static void main(String[] args) {

    }

    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int length1 = split1.length;
        int length2 = split2.length;
        int length = Math.max(length1, length2);
        for (int i = 0; i < length; i++) {
            int n1 = 0;
            int n2 = 0;
            if (i < length1) {
                n1 = Integer.parseInt(split1[i]);
            }
            if (i < length2) {
                n2 = Integer.parseInt(split2[i]);
            }
            if (n1 > n2)
                return 1;
            else if (n1 < n2)
                return -1;
        }
        return 0;
    }
}
