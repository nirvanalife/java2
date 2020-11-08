package 动态规划;

public class test103 {
    /**
     * 给定一个 n * m 的矩阵 a，从左上角开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，输出所有的路径中最小的路径和。
     */
    public static void main(String[] args) {
        int [][]matrix={{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(minPathSum(matrix));
    }
    /**
     *
     * @param matrix int整型二维数组 the matrix
     * @return int整型
     */
    public static int minPathSum (int[][] matrix) {
        // write code here
        int row=matrix.length;
        int col=matrix[0].length;
        int [][]sum=new int[row][col];
        sum[0][0]=matrix[0][0];
        for(int i=1;i<row;i++){
            sum[i][0]=sum[i-1][0]+matrix[i][0];
        }
        for(int j=1;j<col;j++){
            sum[0][j]=sum[0][j-1]+matrix[0][j];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                sum[i][j]=Math.min(sum[i-1][j],sum[i][j-1])+matrix[i][j];
            }
        }

        return sum[row-1][col-1];
    }
}
