package LeetCode_ADailyTopic;

public class Lt_507 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(checkPerfectNumber(496));

    }

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            sum += num % i == 0 ? i + num / i : 0;
        }
        return sum == num;
    }

}
