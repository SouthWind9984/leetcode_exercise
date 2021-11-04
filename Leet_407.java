import java.util.Comparator;
import java.util.PriorityQueue;

public class Leet_407 {
    public static void main(String[] args) {

    }

    public int trapRainWater(int[][] heightMap) {
        int res = 0;
        int width = heightMap.length;
        int height = heightMap[0].length;
        // 检视数组访问
        boolean [][] visited = new boolean[width][height];
        // 存放坐标和高度 三元组，以高度来从低到高排序
        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((Comparator.comparingInt(o -> o[2])));

        // 先将最外一圈放进去
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == height - 1){
                    int [] nums = {i,j,heightMap[i][j]};
                    priorityQueue.offer(nums);
                    // 坐标已经访问过
                    visited[i][j] = true;
                }
            }
        }
        // 向内缩小圈的范围，弹出最小元素
        while (!priorityQueue.isEmpty()){
            // 拿到最小元素，试试四周有没有小于该元素
            int[] nums = priorityQueue.poll();
            int x = nums[0];
            int y = nums[1];
            int num = nums[2];
            // 上
            if (x-1 >= 0 && ! visited[x-1][y]){
                // 比当前最小元素还小，表示可以灌水
                if (num>heightMap[x-1][y]){
                    res+=num-heightMap[x-1][y];
                }
                // 灌水后高度为之前最小元素高度，没灌水取当前高度
                priorityQueue.add(new int[]{x-1,y,Math.max(num,heightMap[x-1][y])});
                visited[x-1][y]=true;
            }
            // 右
            if (y+1 < height && !visited[x][y+1]){
                if (num>heightMap[x][y+1]){
                    res+=num-heightMap[x][y+1];
                }
                priorityQueue.add(new int[]{x,y+1,Math.max(num,heightMap[x][y+1])});
                visited[x][y+1]=true;
            }
            // 下
            if (x+1 < width && !visited[x+1][y]){
                if (num>heightMap[x+1][y]){
                    res+=num-heightMap[x+1][y];
                }
                priorityQueue.add(new int[]{x+1,y,Math.max(num,heightMap[x+1][y])});
                visited[x+1][y]=true;
            }
            // 左
            if (y-1 >= 0 && !visited[x][y-1]){
                if (num>heightMap[x][y-1]){
                    res+=num-heightMap[x][y-1];
                }
                priorityQueue.add(new int[]{x, y-1 ,Math.max(num,heightMap[x][y-1])});
                visited[x][y-1]=true;
            }
        }
        return res;
    }
}
