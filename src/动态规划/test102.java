public class test102 {
    /**
     * 给定一个由非负整数填充的m x n的二维数组，现在要从二维数组的左上角走到右下角，请找出路径上的所有数字之和最小的路径。
     * 注意：你每次只能向下或向右移动。
     */
    public static void main(String[] args) {
        int [][]grid={{1,2},{5,6},{1,1}};
        System.out.println(minPathSum(grid));
    }
    /**
     *
     * @param grid int整型二维数组
     * @return int整型
     */
    public static int minPathSum (int[][] grid) {
        // write code here
        int row=grid.length;
        int col=grid[0].length;
        int [][]sum=new int[row][col];

        sum[0][0]=grid[0][0];
        for(int i=1;i<grid.length;i++){
            sum[i][0]=sum[i-1][0]+grid[i][0];
        }
        for(int j=1;j<grid[0].length;j++){
            sum[0][j]=sum[0][j-1]+grid[0][j];
        }
        for(int i=1;i<grid.length;i++){
            for (int j=1;j<grid[i].length;j++){
                sum[i][j]+=grid[i][j]+Math.min(sum[i][j-1],sum[i-1][j]);
            }
        }
        return sum[row-1][col-1];
    }
}
