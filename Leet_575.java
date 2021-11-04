import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leet_575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(candyType).forEach(set::add);
        return Math.min(set.size(), candyType.length/2);
    }
}
