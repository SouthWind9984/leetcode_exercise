package LeetCode_ADailyTopic;

public class Lt_14 {

    public static void main(String[] args) {
//        String [] sts = {"flower","flow","flight"};
//        System.out.println(longestCommonPrefix(sts));

        int [] arr = new int[10];
        int nums1 [] = {1,2,3,4,5};
        int nums2 [] = {5,4,3,2,1};
        for (int i = 0; i < arr.length; i++) {

        }
       for (int t :
                arr) {
            System.out.print(t+ " ");
        }

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        int index = 0;
        boolean flag = true;
        while (flag){
            char ch = strs[0].charAt(index);
            for (String str :strs) {
                if (index>str.length()-1){
                    flag = false;
                    break;
                }
                if(str.charAt(index)!=ch){
                    flag =false;
                    break;
                }
            }
            if(flag)
                index++;
        }
        return strs[0].substring(0,index);
    }
}
