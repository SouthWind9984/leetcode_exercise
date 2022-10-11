package LeetCode_ADailyTopic;

/**
 * @author SouthWind
 * @date 2022/10/6 8:05
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_927 {


    public static void main(String[] args) {

    }

    /*
    三等分---将数组中的二进制数平分为相等十进制数字，不在于长度
    0 ----- i
    i+1 --- j-1
    j ----- len-1
    [1,0,1,0,1]
    [1,1,1,0,0,1,  1,0,1,0,1,1,   1,1,1,1]
               5            11          len

     现在 1 相等，但数不相等，因为最后的部分后缀没有0
     三组同时从后往前走，如果全部相同返回下标，一个不同则返回-1,-1
     */
    public int[] threeEqualParts(int[] arr) {
        int len = arr.length;
        // 1的个数
        int count_1 = 0;
        for (int j : arr) {
            count_1 += j;
        }
        //全是0的情况下
        if (count_1 == 0) return new int[]{0, 2};
        //不能三等分
        if (count_1 % 3 != 0) return new int[]{-1, -1};
        int three_1 = count_1 / 3;
        //能三等分，记录后缀0
        int suffix_0 = 0;
        for (int i = arr.length - 1; i >= 0 && arr[i] == 0; i--) {
            suffix_0++;
        }
        //1 的个数 + 后缀0 分为一组数字，1 1 1 0
        // 从前往后推导，下一个位置下标
        int index = getIndex(arr, 0, three_1, suffix_0);
        if (index == -1) return new int[]{-1, -1};
        int index1 = getIndex(arr, index + 1, three_1, suffix_0);
        if (index1 == -1) return new int[]{-1, -1};
        //去掉前导0 是否相等
        System.out.println(index + "  " + index1);
        //三组同时从后往前走(走1的个数+后缀0,一组的数)，如果全部相同返回下标，一个不同则返回-1,-1
        for (int i = index, j = index1, k = len - 1, count = 0; count < (three_1 + suffix_0); i--, j--, k--, count++) {
            if (arr[i] != arr[j] || arr[j] != arr[k] || arr[i] != arr[k]) {
                return new int[]{-1, -1};
            }
        }
        return new int[]{index, index1 + 1};
    }

    private int getIndex(int[] arr, int index, int three_1, int suffix) {
        //先把前缀1走完，再走后缀0，同时走完，满足平分要求
        while (index < arr.length) {
            if (arr[index] == 1) {
                three_1--;
            }
            if (three_1 == 0 && arr[index] == 0) {
                suffix--;
            }
            if (three_1 == 0 && suffix == 0)
                return index;
            index++;
        }
        return -1;
    }


}
