import java.util.Comparator;
import java.util.PriorityQueue;

public class Leet_407 {
    public static void main(String[] args) {

    }

    public int trapRainWater(int[][] heightMap) {
        int res = 0;
        int width = heightMap.length;
        int height = heightMap[0].length;
        // �����������
        boolean [][] visited = new boolean[width][height];
        // �������͸߶� ��Ԫ�飬�Ը߶����ӵ͵�������
        PriorityQueue<int []> priorityQueue = new PriorityQueue<>((Comparator.comparingInt(o -> o[2])));

        // �Ƚ�����һȦ�Ž�ȥ
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == height - 1){
                    int [] nums = {i,j,heightMap[i][j]};
                    priorityQueue.offer(nums);
                    // �����Ѿ����ʹ�
                    visited[i][j] = true;
                }
            }
        }
        // ������СȦ�ķ�Χ��������СԪ��
        while (!priorityQueue.isEmpty()){
            // �õ���СԪ�أ�����������û��С�ڸ�Ԫ��
            int[] nums = priorityQueue.poll();
            int x = nums[0];
            int y = nums[1];
            int num = nums[2];
            // ��
            if (x-1 >= 0 && ! visited[x-1][y]){
                // �ȵ�ǰ��СԪ�ػ�С����ʾ���Թ�ˮ
                if (num>heightMap[x-1][y]){
                    res+=num-heightMap[x-1][y];
                }
                // ��ˮ��߶�Ϊ֮ǰ��СԪ�ظ߶ȣ�û��ˮȡ��ǰ�߶�
                priorityQueue.add(new int[]{x-1,y,Math.max(num,heightMap[x-1][y])});
                visited[x-1][y]=true;
            }
            // ��
            if (y+1 < height && !visited[x][y+1]){
                if (num>heightMap[x][y+1]){
                    res+=num-heightMap[x][y+1];
                }
                priorityQueue.add(new int[]{x,y+1,Math.max(num,heightMap[x][y+1])});
                visited[x][y+1]=true;
            }
            // ��
            if (x+1 < width && !visited[x+1][y]){
                if (num>heightMap[x+1][y]){
                    res+=num-heightMap[x+1][y];
                }
                priorityQueue.add(new int[]{x+1,y,Math.max(num,heightMap[x+1][y])});
                visited[x+1][y]=true;
            }
            // ��
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
