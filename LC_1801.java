package LeetCode_ADailyTopic;

import java.util.*;

/**
 * 2023/1/2 22:21
 * SouthWind
 * github.com/SouthWind9984
 * 编程千万条，规范第一条
 */
public class LC_1801 {
    public static void main(String[] args) {
        int [][] ords = new int[][] { {7,1000000000,1},{15,3,0},{5,999999995,0},{5,1,1}};
        getNumberOfBacklogOrders(ords);
    }
    /*
    orders[i] = [price, amount, orderType] 表示有amount笔类型为orderType 、价格为price的订单。

        订单类型 orderType可以分为两种：

        0 表示这是一批采购订单 buy
        1 表示这是一批销售订单 sell

        buy 需要找到一个 sell 类型的订单， 我 sell(销售价格） <=  买家 buy（采购价格） 反之亦然。

     */
    public static int getNumberOfBacklogOrders(int[][] orders) {
        long res = 0;
        //1-2 从小到大排序
        PriorityQueue<int []> buyQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]){
                return o2[1]-o1[1];
            }
            return o2[0] - o1[0];
        });
        PriorityQueue<int []> sellQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]){
                return o2[1]-o1[1];
            }
            return o1[0] - o2[0];
        });
        for (int[] order : orders) {
            int price = order[0];
            int amount = order[1];
            int type = order[2];
            // 采购订单 buy
            if (type == 0) {
                while (!sellQueue.isEmpty()) {
                    int[] sellOrder = sellQueue.peek();
                    // 找到一个最低价格的销售订单抵消
                    if (sellOrder[0] <= price) {
                        int sellAmount = sellOrder[1];
                        res -= Math.min(sellAmount,amount);
                        // 采购数量 大于 销售数量
                        if (amount >= sellAmount) {
                            sellQueue.poll();
                            amount -= sellAmount;
                        } else {
                            sellOrder[1] -= amount;
                            amount = 0;
                            break;
                        }
                    } else break;
                }
                res+=amount;
                buyQueue.offer(new int[]{price,amount});
            }
//            销售订单
            else {
                while (!buyQueue.isEmpty()) {
                    int[] buyOrder = buyQueue.peek();
                    // 找到一个最高价格的销售订单抵消
                    if (buyOrder[0] >= price) {
                        int buyAmount = buyOrder[1];
                        res -= Math.min(buyAmount,amount);
                        // sell 采购数量大于 buy 数量
                        if (amount >= buyAmount) {
                            buyQueue.poll();
                            amount -= buyAmount;
                        } else {
                            buyOrder[1] -= amount;
                            amount = 0;
                            break;
                        }
                    } else break;
                }
                res += amount;
                sellQueue.offer(new int[]{price,amount});
            }
        }
        return (int) (res%1000000007);
    }
}
