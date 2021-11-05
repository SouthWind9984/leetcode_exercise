import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leet_575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return set.size()<candyType.length/2?set.size():candyType.length/2;
    }

}
