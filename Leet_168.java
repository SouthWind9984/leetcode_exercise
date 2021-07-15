package leetcode_exercise;

public class Leet_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    /*
    A-Z = 1 26
    AA = 26+1
    整除26 大于26继续前移
    余数为最后一位

     */
    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            String a = String.valueOf((char) (columnNumber % 26 + 65));
            res.insert(0, a);
            columnNumber /= 26;
        }
        return res.toString().toUpperCase();
    }


}
