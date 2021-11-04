public class Leet_476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    /**
     * �볤��ȫΪ1�����������
     * 1^1 = 0
     * 0^1 = 1
     *
     * ������ȫһ��
     *  ȡ���λ����������һλ���൱�ڳ˶�����һ��Ϊȫһ�Ķ����Ƹ�ʽ����
     * @param num
     * @return
     */
    public static int findComplement(int num) {
        int highestOneBit = Integer.highestOneBit(num);
        highestOneBit<<=1;
        return num^(highestOneBit-1);
    }

}
