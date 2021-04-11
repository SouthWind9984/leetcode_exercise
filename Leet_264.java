package leetcode_exercise;

import java.util.ArrayList;

public class Leet_264 {
    public static void main(String[] args) {
        nthUglyNumber(10);
    }

    /*
    丑数就是质因数只包含 2, 3, 5 的正整数。
    n = 2^a * 3^b * 5^c
    a = b = c = 0   n=1
    [1,
    2,3,5
    4,6,10
    6 9 15
    10 15 25
    ]

     */
    public static int nthUglyNumber(int n) {
        //三指针
        int index2 = 0, index3 = 0, index5 =0;
        int [] nums = new int[n];
        nums[0] = 1;
        for (int i = 1; i < n; i++) {
            nums[i] = Math.min(nums[index2]*2,Math.min(nums[index3]*3,nums[index5]*5));
            if (nums[i]==nums[index2]*2)
                index2++;
            else if (nums[i]==nums[index3]*3)
                index3++;
            else
                index5++;
        }
        return nums[n-1];
    }

}
