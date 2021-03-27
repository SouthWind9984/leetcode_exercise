package leetcode_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lt_706 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
    }

    class MyHashMap {
        Stack<Integer> keys;
        Stack<Integer> values;
        /** Initialize your data structure here. */
        public MyHashMap() {
            keys = new Stack<>();
            values = new Stack<>();
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            if(get(key)==-1) {
                keys.push(key);
                values.push(value);
            }
            else{
                int index = keys.size()-keys.search(key);
                values.set(index,value);
            }
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            if(keys.search(key)==-1){
                return -1;
            }
            else {
                int index = keys.size() - keys.search(key);
                return values.get(index);
            }
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            if(get(key)!=-1) {
                int index = keys.size() - keys.search(key);
                keys.remove(index);
                values.remove(index);
            }
        }
    }
}

