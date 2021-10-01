package LeetCode_ADailyTopic;

public class Lt_705 {
    public static void main(String[] args) {

    }
    class MyHashSet {
        private boolean [] hashSet;
        /** Initialize your data structure here. */
        public MyHashSet() {
            hashSet = new boolean[(int) (Math.pow(10,6)+1)];
        }

        public void add(int key) {
            hashSet[key]=true;
        }

        public void remove(int key) {
            hashSet[key]=false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return hashSet[key];
        }
    }
}
