package LeetCode_ADailyTopic;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Leet_284 implements Iterator<Integer> {
    private List<Integer> list = new ArrayList<>();
    private int index = 0;

    public Leet_284(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(index);
    }

    @Override
    public boolean hasNext() {
        return index + 1 < list.size();
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }
}
