package leetcode_exercise;

import java.util.HashMap;
import java.util.List;

public class Leet_690 {
    public static void main(String[] args) {

    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    ;

    HashMap<Integer, Integer> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            int id1 = employee.id;
            if (id1 == id) {
                int port = employee.importance;
                if (employee.subordinates.size() == 0) {
                    map.put(id1, port);
                    return employee.importance;
                } else {
                    for (Integer subordinate : employee.subordinates) {
                        if (map.containsKey(subordinate)) {
                            port += map.get(subordinate);
                        } else {
                            port += getImportance(employees, subordinate);
                        }
                    }
                    map.put(id1, port);
                    return port;
                }
            }
        }
        return 0;
    }

}
