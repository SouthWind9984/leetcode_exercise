package LeetCode_ADailyTopic;

import java.util.ArrayList;

/**
 * @author SouthWind
 * @date 2022/9/23 11:26
 * @WX公众号：ONE课堂
 * @GitHub: github.com/SouthWind9984
 * 编程千万条，规范第一条
 */

public class Leet_707 {


    public static void main(String[] args) {

    }


    class MyLinkedList {

        ArrayList<Integer> list;

        public MyLinkedList() {
            list = new ArrayList<>();
        }

        public int get(int index) {
            if (index < list.size() && index >= 0)
                return list.get(index);
            else
                return -1;
        }

        public void addAtHead(int val) {
            list.add(0, val);
        }

        public void addAtTail(int val) {
            list.add(list.size(), val);
        }

        public void addAtIndex(int index, int val) {
            if (index < 0)
                addAtHead(val);
            else if (index == list.size())
                addAtTail(val);
            else
                list.add(index, val);
        }

        public void deleteAtIndex(int index) {
            if (get(index) != -1)
                list.remove(index);
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
