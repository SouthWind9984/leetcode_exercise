import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leet_496 {

    public static void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num1 : nums2) {
            while (!stack.isEmpty() && num1 > stack.peek()) {
                map.put(stack.pop(), num1);
            }
            stack.push(num1);
        }
        Arrays.setAll(nums1, i -> map.getOrDefault(nums1[i], -1));
        return nums1;
    }
}
