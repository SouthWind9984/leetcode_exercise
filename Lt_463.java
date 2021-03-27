package leetcode_exercise;

import java.util.Scanner;

public class Lt_463 {

	/**
	 * 给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。

网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。

岛屿中没有“湖”（“湖” 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/island-perimeter
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int [][] arr = new int [4][4];
		int [][] gid = {
				{1},{1}};
//		for(int i=0;i<arr[0].length;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				arr[i][j]=in.nextInt();
//			}
//		}
//		System.out.println(arr.length);
		int result =islandPerimeter(gid);
		System.out.println(result);
	}
	
	public static int islandPerimeter(int[][] grid) {
		
		int count=0;
		int h_count=0;
		int l_count=0;
		for(int i=0;i<grid.length;i++)	//遍历行
		{
			for(int j=0;j<grid[0].length;j++)	//遍历列
			{
				if(grid[i][j]==1) 
				{
					count++;
					if(i<grid.length-1)
					{
						if(grid[i+1][j]==1)
						{
							l_count++;
						}
					}
					if(j<grid[0].length-1) 
					{
						if(grid[i][j+1]==1)
						{
							h_count++;
						}
					}
				}
			}
	
		}
//		for(int i=0;i<grid.length;i++)	//遍历行
//		{
//			for(int j=0;j<grid[0].length-1;j++)	//遍历列
//			{
//				if(grid[i][j]==grid[i][j+1]&&grid[i][j]==1) {
//					h_count++;
//				}
//			}
//		}
//		
//		if(grid.length>1)
//		{
//			for(int j=0;j<grid[0].length;j++)	//遍历列
//			{
//				for(int i=0;i<grid.length-1;i++)	//遍历行
//				{
//					if(grid[i][j]==grid[i+1][j]&&grid[i][j]==1) {
//						l_count++;
//					}
//				}
//			}
//	    }
		System.out.println(h_count);
		System.out.println(l_count);
		return count*4-(h_count+l_count)*2;
	}
}
