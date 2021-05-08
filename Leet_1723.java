package leetcode_exercise;

import java.util.HashSet;
import java.util.Set;

public class Leet_1723 {
    public static void main(String[] args) {
        int[] jobs = {3, 2, 3};
    }

    //尽可能小的最大工作时间
    int res = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {
        assign(jobs, 0, new int[k], 0);
        return res;
    }

    private void assign(int[] jobs, int i, int[] worker, int max) {
        //边界条件判断
        if (i == jobs.length) {
            res = Math.min(res, max);
            return;
        }
        //记录计算过的，如果同一层相同的值已经被计算过了，就不需要在计算了
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < worker.length; j++) {
            //同一层相同的值已经计算过了，就不需要在计算了，直接跳过
            if (!set.add(worker[j]))
                continue;
            //如果时间已经超过之前找的【尽可能小的最大工作时间】，
            //就跳过
            if (worker[j] + jobs[i] >= res)
                continue;
            //选择
            worker[j] += jobs[i];
            assign(jobs, i + 1, worker, Math.max(worker[j], max));
            //撤销选择
            worker[j] -= jobs[i];
        }
    }

}
