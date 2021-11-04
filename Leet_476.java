public class Leet_476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    /**
     * 与长度全为1的数进行异或
     * 1^1 = 0
     * 0^1 = 1
     *
     * 二进制全一：
     *  取最高位进行向左移一位，相当于乘二，减一即为全一的二进制格式数字
     * @param num
     * @return
     */
    public static int findComplement(int num) {
        int highestOneBit = Integer.highestOneBit(num);
        highestOneBit<<=1;
        return num^(highestOneBit-1);
    }

}
