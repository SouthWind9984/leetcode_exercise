package leetcode_exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lt_341 {
    public static void main(String[] args) {

    }

      // This is the interface that allows for creating nested lists.
     // You should not implement it, or speculate about its implementation
      public interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
      }
    public class NestedIterator implements Iterator<Integer> {
        private List<Integer> list;
        private int index = 0;
        public NestedIterator(List<NestedInteger> nestedList) {
            list = new ArrayList<>();
            DFS(nestedList);
        }
        public void DFS(List<NestedInteger> nestedList){
            for (NestedInteger n :nestedList) {
                if(n.isInteger()){
                    list.add(n.getInteger());
                }
                else{
                    DFS(n.getList());
                }
            }
        }
        @Override
        public Integer next() {
            return list.get(index++);
        }

        @Override
        public boolean hasNext() {
            return index<list.size();
        }
    }
}
