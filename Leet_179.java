package leetcode_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Leet_179 {
    public static void main(String[] args) {
        int [] nums = {3,30,35,6,9,54};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        int len = nums.length;
        //创建9个临时列表存放数据
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            arrayLists.add(list1);
        }
//        System.out.println(arrayLists);
        //排序，s1 + s2 > s2 + s1

        //从高到底排序
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                String str1 = ""+nums[j]+nums[i];  //b+a
                String str2 = ""+nums[i]+nums[j];  //a+b
                // 后者为b,大于前者则前移
                if(Long.parseLong(str1)>Long.parseLong(str2)){
                    int tmp = nums[i];
                    nums[i]=nums[j];
                    nums[j] = tmp;
                }
            }
        }
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < len; i++) {
           sbf.append(nums[i]);
        }
        return sbf.toString();
    }
    // 实现Comparator接口
    static class MyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            /*
             * 如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值， 这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了
             */
            return o2 - o1;
        }

        @Override
        public Comparator<Integer> reversed() {
            return null;
        }

        @Override
        public Comparator<Integer> thenComparing(Comparator<? super Integer> other) {
            return null;
        }

        @Override
        public <U> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
            return null;
        }

        @Override
        public <U extends Comparable<? super U>> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<Integer> thenComparingInt(ToIntFunction<? super Integer> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<Integer> thenComparingLong(ToLongFunction<? super Integer> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<Integer> thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) {
            return null;
        }
    }

}
